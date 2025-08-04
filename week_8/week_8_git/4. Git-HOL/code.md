```bash
git branch

* master

gourab@gourab-Vostro-15-3515:~/GitDemo$ git status

On branch master
nothing to commit, working tree clean

gourab@gourab-Vostro-15-3515:~/GitDemo$ git checkout -b GitWork 

Switched to a new branch 'GitWork'

gourab@gourab-Vostro-15-3515:~/GitDemo$ echo "<message>Hello World</message>" > hello.xml

gourab@gourab-Vostro-15-3515:~/GitDemo$ git status

On branch GitWork
Untracked files:
    (use "git add <file>..." to include in what will be committed)
    hello.xml

nothing added to commit but untracked files present (use "git add" to track)

gourab@gourab-Vostro-15-3515:~/GitDemo$ git add .

gourab@gourab-Vostro-15-3515:~/GitDemo$ git commit -m "added hello.xml in GitWork branch"

[GitWork 1378529] added hello.xml in GitWork branch
 1 file changed, 1 insertion(+)
 create mode 100644 hello.xml

gourab@gourab-Vostro-15-3515:~/GitDemo$ git checkout master

Switched to branch 'master'

gourab@gourab-Vostro-15-3515:~/GitDemo$ touch hello.xml

gourab@gourab-Vostro-15-3515:~/GitDemo$ echo "<message>Hello World different</message>" > hello.xml

gourab@gourab-Vostro-15-3515:~/GitDemo$ git add .

gourab@gourab-Vostro-15-3515:~/GitDemo$ git commit -m "added hello.xml in master branch"

[master 16f27df] added hello.xml in master branch
 1 file changed, 1 insertion(+)
 create mode 100644 hello.xml

gourab@gourab-Vostro-15-3515:~/GitDemo$ git log –oneline –graph –decorate –all

fatal: ambiguous argument '–oneline': unknown revision or path not in the working tree.
Use '--' to separate paths from revisions, like this:
'git <command> [<revision>...] -- [<file>...]'

gourab@gourab-Vostro-15-3515:~/GitDemo$ git log --oneline --graph --decorate --all

* 16f27df (HEAD -> master) added hello.xml in master branch
| * 1378529 (GitWork) added hello.xml in GitWork branch
|/  
* c88dcf0 (origin/master) deleted all
* fa52be4 added sample file
*   a8501ae fixed conflict
|\  
| * 97e3fae Initial commit
* f33617c added gitignore
* 6d89220 init

gourab@gourab-Vostro-15-3515:~/GitDemo$ git difftool master GitWork

gourab@gourab-Vostro-15-3515:~/GitDemo$ git merge GitWork

Auto-merging hello.xml
CONFLICT (add/add): Merge conflict in hello.xml
Automatic merge failed; fix conflicts and then commit the result.

gourab@gourab-Vostro-15-3515:~/GitDemo$ nano hello.xml 

gourab@gourab-Vostro-15-3515:~/GitDemo$ cat hello.xml 

<<<<<<< HEAD
<message>Hello World different</message>
=======
<message>Hello World</message>
>>>>>>> GitWork

gourab@gourab-Vostro-15-3515:~/GitDemo$ git mergetool

Merging:
hello.xml

Normal merge conflict for 'hello.xml':
    {local}: created file
    {remote}: created file

gourab@gourab-Vostro-15-3515:~/GitDemo$ nano hello.xml

gourab@gourab-Vostro-15-3515:~/GitDemo$ cat hello.xml

<message>Hello World solved merged conflict</message>

gourab@gourab-Vostro-15-3515:~/GitDemo$ git add hello.xml

gourab@gourab-Vostro-15-3515:~/GitDemo$ git commit -m "Resolved merge conflict between GitWork and master"

[master 5d654c0] Resolved merge conflict between GitWork and master

gourab@gourab-Vostro-15-3515:~/GitDemo$ git status

On branch master
Untracked files:
    (use "git add <file>..." to include in what will be committed)
    hello.xml.orig

nothing added to commit but untracked files present (use "git add" to track)

gourab@gourab-Vostro-15-3515:~/GitDemo$ echo "*.orig" >> .gitignore

gourab@gourab-Vostro-15-3515:~/GitDemo$ git add .gitignore

gourab@gourab-Vostro-15-3515:~/GitDemo$ git commit -m "Added backup files to .gitignore"

[master 51f4a6d] Added backup files to .gitignore
 1 file changed, 1 insertion(+)
 create mode 100644 .gitignore

gourab@gourab-Vostro-15-3515:~/GitDemo$ git branch

    GitWork
* master

gourab@gourab-Vostro-15-3515:~/GitDemo$ git branch -d GitWork

Deleted branch GitWork (was 1378529).

gourab@gourab-Vostro-15-3515:~/GitDemo$ git log --oneline --graph --decorate

* 51f4a6d (HEAD -> master) Added backup files to .gitignore
*   5d654c0 Resolved merge conflict between GitWork and master
|\  
| * 1378529 added hello.xml in GitWork branch
* | 16f27df added hello.xml in master branch
|/  
* c88dcf0 (origin/master) deleted all
* fa52be4 added sample file
*   a8501ae fixed conflict
|\  
| * 97e3fae Initial commit
* f33617c added gitignore
* 6d89220 init

```