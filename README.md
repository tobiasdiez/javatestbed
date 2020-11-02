# javatestbed

Run `./gradlew jpackage`.

BUGS:
1. `build\distribution\hellofx\app` contains `mods` folder with `jar` files.
2. Running `build\distribution\hellofx\hellofx.exe -test` does not print the argument `test` (unless `--win-console` is specified in `build.gradle`)
3. Running `build\distribution\hellofx\hellofx.exe` or `build\image\bin\hellofx.bat` prints 
   ```
    ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the <console></console>
    ```
    This setting is used to illustrate [LOG4J2-2690](https://issues.apache.org/jira/browse/LOG4J2-2690?focusedCommentId=17084703&page=com.atlassian.jira.plugin.system.issuetabpanels%3Acomment-tabpanel#comment-17084703)
