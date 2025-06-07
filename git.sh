#!/bin/bash

mapfile -t commits < <(git rev-list --reverse HEAD)
index=0
total=${#commits[@]}

while true; do
  commit=${commits[$index]}
  echo -e "\nChecking out commit [$((index + 1))/$total]: $commit"
  git checkout $commit

  echo -e "[Press Tab for NEXT, Backspace for PREVIOUS, q to quit]"

  IFS= read -rsn1 key1
  keycode=$(printf '%d' "'$key1")

  echo "DEBUG: ASCII = $keycode"

  case $keycode in
    9)
      # Tab
      ((index++))
      if (( index >= total )); then
        echo "✅ Reached the last commit."
        git checkout main
        break
      fi
      ;;
    127)
      # Backspace
      ((index--))
      if (( index < 0 )); then
        index=0
        echo "⚠️  Already at the first commit."
      fi
      ;;
    113|81)
      # q or Q
      echo "👋 Exiting."
      git checkout main
      break
      ;;
    *)
      echo "⛔ Unsupported key (ASCII: $keycode)"
      ;;
  esac
done