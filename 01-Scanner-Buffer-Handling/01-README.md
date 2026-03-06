💡 Java Tip: Scanner Buffer Fix
❓ The Issue
scan.nextInt() leaves a Newline (\n) in the buffer, causing the following scan.nextLine() to be skipped.

✅ The Solution
Add an extra scan.nextLine() between them to Flush the Buffer.

🛠️ Key Terms
Buffer: Temporary memory storage.

Flush: Clearing leftover characters from memory.
