# lzz
lzz base, core, tools, utils

发布到 https://github.com/lzz-io/maven-repository

```xml
<repositories>
    <repository>
        <id>lzz-github-maven-repo</id>
        <url>https://raw.githubusercontent.com/lzz-io/maven-repository/master/repository</url>
    </repository>
</repositories>
```



```xml
<dependency>
  <groupId>io.lzz</groupId>
  <artifactId>lzz-core</artifactId>
  <version>x.x.x</version>
</dependency>
```



##### 注：

插件com.github.github:site-maven-plugin经常出错，改为手动发布到github

**1、maven-release-plugin**

- release:prepare 准备
- release:perform 发布

**2、git push to github**

https://github.com/lzz-io/maven-repository