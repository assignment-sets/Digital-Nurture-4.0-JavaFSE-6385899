```bash
git checkout -b GitNewBranch 

Switched to a new branch 'GitNewBranch'

gourab@gourab-Vostro-15-3515:~/GitDemo$ git branch -a

* GitNewBranch
    master
    remotes/origin/master

gourab@gourab-Vostro-15-3515:~/GitDemo$ echo "hello from new branch" > newBranch.txt

gourab@gourab-Vostro-15-3515:~/GitDemo$ git status

On branch GitNewBranch
Untracked files:
    (use "git add <file>..." to include in what will be committed)
    newBranch.txt

nothing added to commit but untracked files present (use "git add" to track)

git add .

gourab@gourab-Vostro-15-3515:~/GitDemo$ git commit -m "added sample file"

[GitNewBranch fa52be4] added sample file
 1 file changed, 1 insertion(+)
 create mode 100644 newBranch.txt

gourab@gourab-Vostro-15-3515:~/GitDemo$ git checkout master

Switched to branch 'master'

gourab@gourab-Vostro-15-3515:~/GitDemo$ git diff master..GitNewBranch

diff --git a/newBranch.txt b/newBranch.txt
new file mode 100644
index 0000000..83123b5
--- /dev/null
+++ b/newBranch.txt
@@ -0,0 +1 @@
+hello from new branch

gourab@gourab-Vostro-15-3515:~$ git config --global diff.tool p4merge

git config --global merge.tool p4merge

git config --global difftool.prompt false

git config --global mergetool.prompt false

git config --global difftool.p4merge.cmd '~/Downloads/p4v/p4v-2025.2.2796382/bin/p4merge "$LOCAL" "$REMOTE"'

git config --global mergetool.p4merge.cmd '~/Downloads/p4v/p4v-2025.2.2796382/bin/p4merge "$BASE" "$LOCAL" "$REMOTE" "$MERGED"'

git difftool master..GitNewBranch

gourab@gourab-Vostro-15-3515:~/GitDemo$ git merge GitNewBranch

Updating a8501ae..fa52be4
Fast-forward
 newBranch.txt | 1 +
 1 file changed, 1 insertion(+)
 create mode 100644 newBranch.txt

gourab@gourab-Vostro-15-3515:~/GitDemo$ git commit

On branch master
nothing to commit, working tree clean

gourab@gourab-Vostro-15-3515:~/GitDemo$ git log --oneline --graph --decorate

* fa52be4 (HEAD -> master, GitNewBranch) added sample file
*   a8501ae (origin/master) fixed conflict
|\  
| * 97e3fae Initial commit
* f33617c added gitignore
* 6d89220 init

gourab@gourab-Vostro-15-3515:~/GitDemo$ git branch -d GitNewBranch

Deleted branch GitNewBranch (was fa52be4).

gourab@gourab-Vostro-15-3515:~/GitDemo$ git branch

* master

gourab@gourab-Vostro-15-3515:~/GitDemo$ git status

On branch master
nothing to commit, working tree clean

git push origin master

Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 374 bytes | 374.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
To github.com-scrap:helloGourab/GitDemo.git
     a8501ae..fa52be4  master -> master

```