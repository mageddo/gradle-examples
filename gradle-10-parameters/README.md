Create your own build parameters

```bash
../gradlew printParameter -PfailFast=1

> Configure project :
Result value is: true

BUILD SUCCESSFUL in 2s
```

```bash
FAILFAST=1 ../gradlew printParameter

> Configure project :
Result value is: true

BUILD SUCCESSFUL in 2s
```

```bash
../gradlew printParameter

> Configure project :
Result value is: false

BUILD SUCCESSFUL in 2s
```