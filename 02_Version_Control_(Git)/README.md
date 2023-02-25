# (2) Version Control (GIT)

## Tools
- Version Control System (VCS)
- Source Code Manager (SCM)
- Revision Control System (RCS)

## Apa itu GIT?
Git merupakan version control system (vcs) yang biasa digunakan oleh para pengembang software untuk mengembangkan softwarenya bersama.

## Sinkronisasi ke remot
Para pengembang dapat berkolaborasi dengan mensinkronisasi komputer mereka masing-masing ke server melalui remote.

## Git repository
Pada git repository ini merupakans suatu wadah untuk menampung folder maupun file yang sedang dikerjakan, juga dapat menyimpan history.

## Staging area
- Working directory (git add)
- Staging Area (git commit)
- Git repository

## Git command status, add, commit
Git status disini untuk melihat status pada repository, dapat mengetahui informasi mengenai file yang diubah dan ditambah, dan lainnya. Git add berguna untuk melakukan perubahan pada file ke staging area. Git commit berguna untuk menyimpan perubahan yang sudah dilakukan.

## Git command push, fetch, pull
- Git push, untuk mempush perubahan ke remote repo.
- Git fetch, untuk mendapatkan perubahan yang baru dilakukan.
- Git pull, untuk mengambil perubahan terbaru dari remote repo dan merge ke branch.

## Branch
Branch pada github dapat digunakan untuk memperbaiki sesuatu yang ada pada branch utama tanpa merubah branch utamanya, jika sudah selesai maka akan dimerge, cara yang dapat dilakukan adalah :
- git branch -M develop
- git add .
- git commit -m "message"
- git push -u origin develop

## Pull request
Pull request adalah step sebelum merge yang mana pengembang akan request perubahan ke branch utama atau kode utama, pada github sendiri terdapat fitur pull request.