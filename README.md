## 一、什么是UIAutomator?

* **UIAutomator** 是用来做UI测试的，相当于普通的手工测试；
* 常用UI回归测试需要将所有的功能测试一遍，非常耗费时间，比较高效和可靠的UI 测试方式就是自动化测试；
* UIAutomator 就是自动化测试工具；


## 二、UI 自动化测试工具

* **uiautomatorviewer** ： 一个图形界面工具来扫描和分析应用的UI控件。
* **uiautomator** ： 一个测试的Java库，包含了创建UI测试的各种API和执行自动化测试的引擎。



## 三、UIAutomator 使用步骤

1. 新建一个项目，在app的gradle文件中配置：
```
androidTestImplementation 'com.android.support.test.uiautomator:uiautomator-v18:2.1.3'
```
2. 在androidTest 目录下新建一个类：
```

@RunWith(AndroidJUnit4.class)
public class WaiqinUIAutomatorTest {

    public Instrumentation mInstrumentation;
    public UiDevice mUiDevice;

    @Before
    public void setUp() {
        mInstrumentation = InstrumentationRegistry.getInstrumentation();
        mUiDevice = UiDevice.getInstance(mInstrumentation);
    }

    @Test
    public void openRecentApps() throws RemoteException {
        mUiDevice.pressRecentApps();
    }

       @After
    public void restore() {
      mUiDevice.pressHome();
    }
}
```
3. 导出查看测试报告；
4. 单个测试用例执行与整个测试用例的执行是差不多的，只是整个用例在执行的时候是无序的，则需要保证一个用例执行完成之后，恢复到下一个用例执行的条件；@After注解的方法中恢复；


## 四、通过API来写测试用例

* **By 类:**
```
1. resource-id     -->By.res();
2. text            -->By.text();
3. content-desc    -->By.desc();
4. check           -->By.checked();
5. focused         -->By.focused();
```

* **常见的组件操作:(UiObject2)**
```
1. 点击  ： click()
2. 长按  :  longClick()
3. 拖动  :  drag()
4. 输入  :  setText()
```

* **常见的设备操作：(UiDevice)**
```
1. 点击  ： click(int x,int y);
2. 按键  ： pressKeyCode(int keyCode)
3. 滑动  ： swip(int startX,in startY, int stopX ,int stopY,int steps)
```


## 五、参数资料

* [使用uiautomator做UI测试](http://blog.chengyunfeng.com/?p=504)
* [uiautomator2 使用Python测试 Android应用](https://www.cnblogs.com/fnng/p/8486863.html)


## 六、额外功能

**1. 添加了CUP架构类型判断库：**
```
 private String isWhichCpu() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("手机CPU型号：\n");
        stringBuffer.append("isArmCpu：" + CPUFrameworkHelper.isArmCpu() + "\n");
        stringBuffer.append("isArm7Compatible：" + CPUFrameworkHelper.isArm7Compatible() + "\n");
        stringBuffer.append("isMipsCpu：" + CPUFrameworkHelper.isMipsCpu() + "\n");
        stringBuffer.append("isX86Cpu：" + CPUFrameworkHelper.isX86Cpu() + "\n");
        stringBuffer.append("isArm64Cpu：" + CPUFrameworkHelper.isArm64Cpu() + "\n");
        stringBuffer.append("isMips64Cpu：" + CPUFrameworkHelper.isMips64Cpu() + "\n");
        stringBuffer.append("isX86_64Cpu：" + CPUFrameworkHelper.isX86_64Cpu() + "\n");
        return stringBuffer.toString();
    }
```

**2. 添加AutoEx库，让项目在崩溃时从异常堆栈中，自动寻找Stack Overflow的回答：**[参考文章](https://juejin.im/repo/5ae919db51882536711435ea?utm_source=gold_browser_extension)
```
1. 默认方法：
 AutoEx.apply(this);
2. 配置方法：
 /**
     * @param mApp    Applicatin
     * @param maxSize 最大提示答案数目
     * @param tag     自定义日志 默认 AutoEx
     * @param isDebug 是否开启调试 true为开启 false为关闭 默认开启
*/
public static void apply(Context mApp, int maxSize, String tag, boolean isDebug)
```