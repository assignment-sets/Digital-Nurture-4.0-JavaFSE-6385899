```bash
gourab@gourab-Vostro-15-3515:~$ git --version
git version 2.43.0

gourab@gourab-Vostro-15-3515:~$ git config --global --list
user.name=assignment-sets
user.email=mondalgourab140@gmail.com
init.templatedir=/home/gourab/.git-templates

gourab@gourab-Vostro-15-3515:~$ git config --global core.editor "code --wait"

gourab@gourab-Vostro-15-3515:~$ cat ~/.gitconfig
[user]
	name = assignment-sets
	email = mondalgourab140@gmail.com
[init]
	templateDir = /home/gourab/.git-templates
[core]
	editor = code --wait

gourab@gourab-Vostro-15-3515:~$ git init GitDemo
hint: Using 'master' as the name for the initial branch. This default branch name
hint: is subject to change. To configure the initial branch name to use in all
hint: of your new repositories, which will suppress this warning, call:
hint:
hint: 	git config --global init.defaultBranch <name>
hint:
hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
hint: 'development'. The just-created branch can be renamed via this command:
hint:
hint: 	git branch -m <name>
Initialized empty Git repository in /home/gourab/GitDemo/.git/

gourab@gourab-Vostro-15-3515:~$ ls
blogs       coding   Documents  GitDemo           IdeaProjects  my-cron-jobs  Public    snap       tsetup.5.15.4
chrome-ext  Desktop  Downloads  google-cloud-sdk  Music         Pictures      recovery  Templates  Videos

gourab@gourab-Vostro-15-3515:~$ echo "welcome to version ctrl" > GitDemo/welcome.txt

gourab@gourab-Vostro-15-3515:~$ cd GitDemo/ && ls -lta
total 16
drwxrwxr-x  3 gourab gourab 4096 Aug  3 11:08 .
-rw-rw-r--  1 gourab gourab   24 Aug  3 11:08 welcome.txt
drwxrwxr-x  5 gourab gourab 4096 Aug  3 11:08 .git
drwxr-x--- 42 gourab gourab 4096 Aug  3 11:08 ..

gourab@gourab-Vostro-15-3515:~/GitDemo$ cat welcome.txt
welcome to version ctrl

gourab@gourab-Vostro-15-3515:~/GitDemo$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	welcome.txt

nothing added to commit but untracked files present (use "git add" to track)

gourab@gourab-Vostro-15-3515:~/GitDemo$ git add welcome.txt

gourab@gourab-Vostro-15-3515:~/GitDemo$ git commit -m "init"
[master (root-commit) 6d89220] init
 1 file changed, 1 insertion(+)
 create mode 100644 welcome.txt

gourab@gourab-Vostro-15-3515:~/GitDemo$ git remote add origin git@github.com-scrap:helloGourab/GitDemo.git

gourab@gourab-Vostro-15-3515:~/GitDemo$ git pull origin main
git status
On branch master
nothing to commit, working tree clean

gourab@gourab-Vostro-15-3515:~/GitDemo$ ls
welcome.txt

gourab@gourab-Vostro-15-3515:~/GitDemo$ git push origin master
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 240 bytes | 240.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
remote:
remote: Create a pull request for 'master' on GitHub by visiting:
remote:      https://github.com/helloGourab/GitDemo/pull/new/master
remote:
To github.com-scrap:helloGourab/GitDemo.git
 * [new branch]      master -> master

```
