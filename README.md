# NewProject 项目下载下来，不能直接运行，需要build.gradle 文件中粘贴以下内容
// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:2.3.1'

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        jcenter()
    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
}


因为首次在下载项目时 build.gradle 文件是空的。

注：“build.gradle 该文件打开，显示的也就是项目文件”
