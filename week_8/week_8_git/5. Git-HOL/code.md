```bash
git checkout master

Already on 'master'

gourab@gourab-Vostro-15-3515:~/GitDemo$ git status

On branch master
nothing to commit, working tree clean

gourab@gourab-Vostro-15-3515:~/GitDemo$ git branch -a

* master
    remotes/origin/master

gourab@gourab-Vostro-15-3515:~/GitDemo$ git pull origin master

From github.com-scrap:helloGourab/GitDemo
 * branch            master     -> FETCH_HEAD
Already up to date.

gourab@gourab-Vostro-15-3515:~/GitDemo$ git checkout -b Git-T03-HOL_002

Switched to a new branch 'Git-T03-HOL_002'

gourab@gourab-Vostro-15-3515:~/GitDemo$ echo "local changes" > local.txt

gourab@gourab-Vostro-15-3515:~/GitDemo$ git add .

gourab@gourab-Vostro-15-3515:~/GitDemo$ git commit -m "local changes in Git-T03-HOL_002"

[Git-T03-HOL_002 cb6feac] local changes in Git-T03-HOL_002
 1 file changed, 1 insertion(+)
 create mode 100644 local.txt

gourab@gourab-Vostro-15-3515:~/GitDemo$ git status

On branch Git-T03-HOL_002
nothing to commit, working tree clean

gourab@gourab-Vostro-15-3515:~/GitDemo$ git push origin Git-T03-HOL_002

Enumerating objects: 16, done.
Counting objects: 100% (16/16), done.
Delta compression using up to 8 threads
Compressing objects: 100% (8/8), done.
Writing objects: 100% (15/15), 1.29 KiB | 660.00 KiB/s, done.
Total 15 (delta 2), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (2/2), done.
remote:
remote: Create a pull request for 'Git-T03-HOL_002' on GitHub by visiting:
remote:      https://github.com/helloGourab/GitDemo/pull/new/Git-T03-HOL_002
remote:
To github.com-scrap:helloGourab/GitDemo.git
 * [new branch]      Git-T03-HOL_002 -> Git-T03-HOL_002

gourab@gourab-Vostro-15-3515:~/GitDemo$ git checkout master

Switched to branch 'master'

gourab@gourab-Vostro-15-3515:~/GitDemo$ git fetch origin

gourab@gourab-Vostro-15-3515:~/GitDemo$ git log origin/Git-T03-HOL_002 --oneline

cb6feac (origin/Git-T03-HOL_002, Git-T03-HOL_002) local changes in Git-T03-HOL_002
51f4a6d (HEAD -> master) Added backup files to .gitignore
5d654c0 Resolved merge conflict between GitWork and master
16f27df added hello.xml in master branch
1378529 added hello.xml in GitWork branch
c88dcf0 (origin/master) deleted all
fa52be4 added sample file
a8501ae fixed conflict
f33617c added gitignore
97e3fae Initial commit
6d89220 init

```
