# javatestbed

Run `./gradlew jpackage`.

BUGS:
1. `build\distribution\hellofx\app` contains `mods` folder with `jar` files.
2. Running `build\distribution\hellofx\hellofx.exe -test` does not print the argument `test` (unless `--win-console` is specified in `build.gradle`)
3. Running `build\distribution\hellofx\hellofx.exe` prints 
   ```
    ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the <console></console>
    ```
