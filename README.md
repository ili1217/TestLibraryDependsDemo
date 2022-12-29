## About
测试上传SDK，并且引入测试

## Gradle
```
implementation 'com.github.ili1217:TestLibraryDependsDemo:1.0.0'
```
jitpack还要求在工程根目录的`build.gradle`中添加如下：
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
