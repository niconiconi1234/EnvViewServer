# EnvViewServer
## Description
This is a simple server that allows you to view the environment variables of the server it is running on. It is written in Java and uses the Spring Boot framework.
## Building
### Dependencies
* Java 17
  
To build the project, run the following command:
```
./gradlew build
```

The build will be located in `build/libs/` directory.

After building, you can run the server with the following command in `build/libs/` directory:
```
java -jar env-view-server-0.0.1-SNAPSHOT.jar.jar
```

## Docker
We have built a docker image of this project and pushed it to Docker Hub. You can pull and run it with the following command:
```
docker run -p 8080:8080 huajuan6848/env-view-server:0.0.1-SNAPSHOT
```

## Usage
After running it, you can access the server at `http://hostname:8080/env`. It will display the environment variables of the server it is running on. Remember to replace `hostname` with the actual hostname of the server.
```
$ curl http://hostname:8080/env
PATH=/opt/homebrew/opt/node@18/bin:/Users/huajuan/.jenv/shims:/Users/huajuan/.jenv/bin:/opt/homebrew/opt/tomcat@7/bin:/Applications/XAMPP/bin:/Users/huajuan/mongodb/bin:/opt/homebrew/opt/node@16/bin:/Library/Frameworks/Python.framework/Versions/2.7/bin:/opt/homebrew/bin:/opt/homebrew/sbin:/usr/local/bin:/System/Cryptexes/App/usr/bin:/usr/bin:/bin:/usr/sbin:/sbin:/Applications/VMware Fusion.app/Contents/Public:/Library/TeX/texbin:/opt/X11/bin:/Applications/Wireshark.app/Contents/MacOS:/var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/local/bin:/var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/bin:/var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/appleinternal/bin:/Users/huajuan/.sdkman/candidates/maven/current/bin:/Users/huajuan/.sdkman/candidates/jmeter/current/bin:/Users/huajuan/.sdkman/candidates/java/current/bin:/Users/huajuan/.sdkman/candidates/groovy/current/bin:/Users/huajuan/.sdkman/candidates/gradle/current/bin:/opt/homebrew/opt/node@18/bin:/Users/huajuan/.jenv/shims:/Users/huajuan/.jenv/bin:/opt/homebrew/opt/tomcat@7/bin:/opt/homebrew/anaconda3/bin:/opt/homebrew/anaconda3/condabin:/Applications/XAMPP/bin:/Users/huajuan/mongodb/bin:/opt/homebrew/opt/node@16/bin:/Library/Frameworks/Python.framework/Versions/2.7/bin:/opt/homebrew/bin:/opt/homebrew/sbin:/Users/huajuan/.fig/bin:/Users/huajuan/.local/bin:/Users/huajuan/devtools/flutter/bin:/Users/huajuan/Library/Application Support/JetBrains/Toolbox/scripts:/Users/huajuan/Library/Android/sdk/platform-tools:/Users/huajuan/Library/Android/sdk/cmdline-tools/latest/bin:/Users/huajuan/Library/Android/sdk/emulator:/Users/huajuan/devtools/flutter/bin:/Users/huajuan/Library/Application Support/JetBrains/Toolbox/scripts:/Users/huajuan/Library/Android/sdk/platform-tools/:/Users/huajuan/Library/Android/sdk/cmdline-tools/latest/bin/:/Users/huajuan/Library/Android/sdk/emulator/:/bin
CONDA_DEFAULT_ENV=base
FIG_PID=69902
CONDA_PYTHON_EXE=/opt/homebrew/anaconda3/bin/python
VSCODE_GIT_IPC_HANDLE=/var/folders/g5/p8hg91px5p32wwwy7rtbn3cw0000gn/T/vscode-git-10fbbbeecc.sock
ANDROID_HOME=/Users/huajuan/Library/Android/sdk
CONDA_PREFIX=/opt/homebrew/anaconda3
MAVEN_HOME=/Users/huajuan/.sdkman/candidates/maven/current
COLORTERM=truecolor
SDKMAN_DIR=/Users/huajuan/.sdkman
LOGNAME=huajuan
VSCODE_GIT_ASKPASS_NODE=/Applications/Visual Studio Code.app/Contents/Frameworks/Code Helper (Plugin).app/Contents/MacOS/Code Helper (Plugin)
TERM_PROGRAM_VERSION=1.80.1
PWD=/Users/huajuan/code/env-view-server
GIT_ASKPASS=/Applications/Visual Studio Code.app/Contents/Resources/app/extensions/git/dist/askpass.sh
JAVA_MAIN_CLASS_70135=org.huajuan.envviewserver.EnvViewServerApplication
INFOPATH=/opt/homebrew/share/info:/opt/homebrew/share/info:
FIGTERM_SESSION_ID=7de39197-e66f-45f7-a355-7f4125bef424
SHELL=/bin/zsh
FIG_TERM=2.16.0
PAGER=less
FIG_SET_PARENT_CHECK=1
SDKMAN_CANDIDATES_API=https://api.sdkman.io/2
OLDPWD=/Users/huajuan/code/env-view-server
HOMEBREW_CELLAR=/opt/homebrew/Cellar
ZSH=/Users/huajuan/.oh-my-zsh
TMPDIR=/var/folders/g5/p8hg91px5p32wwwy7rtbn3cw0000gn/T/
ORIGINAL_XDG_CURRENT_DESKTOP=undefined
XPC_FLAGS=0x0
FLUTTER_BASE=/Users/huajuan/devtools/flutter
LC_FIG_SET_PARENT=7de39197-e66f-45f7-a355-7f4125bef424
__CF_USER_TEXT_ENCODING=0x1F5:0x19:0x34
CONDA_PROMPT_MODIFIER=(base) 
LESS=-R
SHLVL=1
MallocNanoZone=0
MANPATH=/opt/homebrew/share/man:/usr/share/man:/usr/local/share/man:/Library/TeX/Distributions/.DefaultTeX/Contents/Man:/opt/X11/share/man:/Applications/Wireshark.app/Contents/Resources/share/man:/opt/homebrew/share/man::
CONDA_EXE=/opt/homebrew/anaconda3/bin/conda
JAVA_HOME=/Users/huajuan/.sdkman/candidates/java/current
TERM=xterm-256color
LANG=en_US.UTF-8
HOMEBREW_PREFIX=/opt/homebrew
GRADLE_HOME=/Users/huajuan/.sdkman/candidates/gradle/current
COMMAND_MODE=unix2003
VSCODE_GIT_ASKPASS_MAIN=/Applications/Visual Studio Code.app/Contents/Resources/app/extensions/git/dist/askpass-main.js
GROOVY_HOME=/Users/huajuan/.sdkman/candidates/groovy/current
DISPLAY=:0
_CE_M=
TTY=/dev/ttys019
VSCODE_GIT_ASKPASS_EXTRA_ARGS=--ms-enable-electron-run-as-node
HOMEBREW_REPOSITORY=/opt/homebrew
XPC_SERVICE_NAME=0
CONDA_SHLVL=1
_=/usr/bin/env
SDKMAN_CANDIDATES_DIR=/Users/huajuan/.sdkman/candidates
__CFBundleIdentifier=com.microsoft.VSCode
JMETER_HOME=/Users/huajuan/.sdkman/candidates/jmeter/current
TERM_PROGRAM=vscode
LSCOLORS=Gxfxcxdxbxegedabagacad
SDKMAN_PLATFORM=darwinarm64
USER=huajuan
ANDROID_SDK_ROOT=/Users/huajuan/Library/Android/sdk
GOROOT=/opt/homebrew/Cellar/go@1.19/1.19.7
SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.MfqhGJhLIC/Listeners
_CE_CONDA=
FIG_SET_PARENT=7de39197-e66f-45f7-a355-7f4125bef424
JENV_SHELL=zsh
HOME=/Users/huajuan
JENV_LOADED=1
```