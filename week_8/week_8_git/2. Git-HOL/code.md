```bash
mkdir logs

gourab@gourab-Vostro-15-3515:~/GitDemo$ touch debug.log

gourab@gourab-Vostro-15-3515:~/GitDemo$ touch logs/other.log

gourab@gourab-Vostro-15-3515:~/GitDemo$ ls -l
total 8
-rw-rw-r-- 1 gourab gourab    0 Aug  3 12:04 debug.log
drwxrwxr-x 2 gourab gourab 4096 Aug  3 12:04 logs
-rw-rw-r-- 1 gourab gourab   24 Aug  3 11:08 welcome.txt

gourab@gourab-Vostro-15-3515:~/GitDemo$ nano .gitignore

cat .gitignore 
logs/
*.log

gourab@gourab-Vostro-15-3515:~/GitDemo$ git status
On branch master
Untracked files:
    (use "git add <file>..." to include in what will be committed)
    .gitignore

nothing added to commit but untracked files present (use "git add" to track)

gourab@gourab-Vostro-15-3515:~/GitDemo$ git add .

gourab@gourab-Vostro-15-3515:~/GitDemo$ git commit -m "added gitignore"
[master f33617c] added gitignore
 1 file changed, 2 insertions(+)
 create mode 100644 .gitignore

gourab@gourab-Vostro-15-3515:~/GitDemo$ git push origin master
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 298 bytes | 298.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
To github.com-scrap:helloGourab/GitDemo.git
     6d89220..f33617c  master -> master

```
