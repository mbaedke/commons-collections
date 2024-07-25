In order to build locally, set up a toolchain in your `~/.m2/toolchains.xml` file 
and include the following:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<toolchains>
  <!-- JDK toolchains -->
  <toolchain>
    <type>jdk</type>
    <provides>
      <version>1.7</version>
      <vendor>oracle</vendor>
    </provides>
    <configuration>
      <!-- Replace with your java 7 home       -->
      <jdkHome>/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/</jdkHome>
    </configuration>
  </toolchain>
</toolchains>
```