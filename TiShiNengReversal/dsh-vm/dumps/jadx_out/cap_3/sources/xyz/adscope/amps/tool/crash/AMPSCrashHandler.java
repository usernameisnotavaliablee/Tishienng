package xyz.adscope.amps.tool.crash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSCrashHandler implements java.lang.Thread.UncaughtExceptionHandler {
    private static final java.lang.String CRASH_AFFILIATED_ADSCOPE_AMPS = "Adscope-AMPS";
    private static final java.lang.String CRASH_AFFILIATED_ADSCOPE_ASMS = "Adscope-ASMS";
    private static final java.lang.String CRASH_AFFILIATED_ADSCOPE_ASNP = "Adscope-ASNP";
    private static final java.lang.String CRASH_AFFILIATED_ADSCOPE_COMMON = "Adscope-COMMON";
    private static final java.lang.String CRASH_AFFILIATED_APP = "APP";
    private static final java.lang.String CRASH_FILE_PATH = "/AMPS/crash/log/";
    private static final java.lang.String CRASH_PACKAGE_NAME_ADSCOPE_AMPS = "xyz.adscope.amps";
    private static final java.lang.String CRASH_PACKAGE_NAME_ADSCOPE_ASMS = "xyz.adscope.asms";
    private static final java.lang.String CRASH_PACKAGE_NAME_ADSCOPE_ASNP = "xyz.adscope.amps";
    private static final java.lang.String CRASH_PACKAGE_NAME_ADSCOPE_COMMON = "xyz.adscope.common";
    private static final boolean DEBUG = true;
    private static final java.lang.String FILE_NAME = "crash_";
    private static final java.lang.String FILE_NAME_SUFFIX = ".trace";
    private static final java.lang.String TAG = "CrashHandler";
    private static xyz.adscope.amps.tool.crash.AMPSCrashHandler sInstance;
    private android.content.Context mContext;
    private java.lang.Thread.UncaughtExceptionHandler mDefaultCrashHandler;


    static {
            xyz.adscope.amps.tool.crash.AMPSCrashHandler r0 = new xyz.adscope.amps.tool.crash.AMPSCrashHandler
            r0.<init>()
            xyz.adscope.amps.tool.crash.AMPSCrashHandler.sInstance = r0
            return
    }

    private AMPSCrashHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$000(xyz.adscope.amps.tool.crash.AMPSCrashHandler r0, java.lang.Throwable r1) {
            r0.writeCrash(r1)
            return
    }

    public static xyz.adscope.amps.tool.crash.AMPSCrashHandler getInstance() {
            xyz.adscope.amps.tool.crash.AMPSCrashHandler r0 = xyz.adscope.amps.tool.crash.AMPSCrashHandler.sInstance
            return r0
    }

    private boolean handleException(java.lang.Throwable r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.Thread r0 = new java.lang.Thread
            xyz.adscope.amps.tool.crash.AMPSCrashHandler$1 r1 = new xyz.adscope.amps.tool.crash.AMPSCrashHandler$1
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r0.start()
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L17
            goto L2e
        L17:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "CrashHandler"
            xyz.adscope.common.tool.LogUtil.e(r0, r3)
        L2e:
            r3 = 1
            return r3
    }

    private void writeCrash(java.lang.Throwable r3) {
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r3.getClass()
            java.lang.Throwable r3 = r3.getCause()
        L11:
            if (r3 == 0) goto L18
            java.lang.Throwable r3 = r3.getCause()
            goto L11
        L18:
            r1.close()
            java.lang.String r3 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L34
            java.lang.String r0 = "crash_request_sdk"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L34
            java.lang.String r0 = "amps_crash_reason_key"
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            xyz.adscope.amps.tool.persistent.sp.AMPSSpUtil.put(r0, r1)
        L34:
            r2.writeLog(r3)
            return
    }

    private void writeLog(java.lang.String r11) {
            r10 = this;
            java.lang.String r0 = "CrashHandler"
            java.lang.String r1 = "\r\n"
            java.lang.String r2 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.String r3 = "mounted"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            if (r2 != 0) goto L19
            java.lang.String r11 = "sdcard unmounted,skip dump exception"
            xyz.adscope.common.tool.LogUtil.e(r0, r11)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            return
        L16:
            r11 = move-exception
            goto Lda
        L19:
            android.content.Context r2 = r10.mContext     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            if (r2 != 0) goto L1f
            goto Lee
        L1f:
            java.io.File r2 = xyz.adscope.common.tool.utils.FileUtils.getAppRootPath(r2)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            if (r2 == 0) goto Lee
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r3.<init>()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.String r2 = r2.getPath()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r3.append(r2)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.String r2 = "/AMPS/crash/log/"
            r3.append(r2)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            if (r4 != 0) goto L48
            r3.mkdirs()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
        L48:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            long r5 = r5.getId()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.String r8 = "yyyy-MM-dd HH:MM:SS"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.util.Date r8 = new java.util.Date     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.String r7 = r7.format(r8)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r8.<init>()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.String r9 = "crash_"
            r8.append(r9)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r8.append(r5)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.String r5 = "_"
            r8.append(r5)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r8.append(r3)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.String r3 = ".trace"
            r8.append(r3)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.String r3 = r8.toString()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r4.<init>()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.String r5 = "false"
            r4.put(r3, r5)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.String r5 = "ampsCrashReport"
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            xyz.adscope.amps.tool.persistent.sp.AMPSSpUtil.put(r5, r4)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r5.<init>()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r5.append(r2)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r5.append(r3)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r4.createNewFile()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r3 = 1
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r3.write(r7)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r3.write(r1)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.String r4 = "------------------crash----------------------"
            r3.write(r4)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r3.write(r1)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r3.write(r11)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r3.write(r1)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            java.lang.String r11 = "-------------------end-----------------------"
            r3.write(r11)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r3.newLine()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r3.close()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            r2.close()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> Lee
            return
        Lda:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "e : "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            xyz.adscope.common.tool.LogUtil.e(r0, r11)
        Lee:
            return
    }

    public java.util.List<xyz.adscope.amps.model.crash.AMPSCrashRequestModel> getCrashData() {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r11.mContext
            java.io.File r1 = xyz.adscope.common.tool.utils.FileUtils.getAppRootPath(r1)
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = "/AMPS/crash/log/"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.List r0 = xyz.adscope.common.tool.utils.FileUtils.getFileList(r0)
            java.lang.String r1 = "ampsCrashReport"
            java.lang.String r2 = xyz.adscope.amps.tool.persistent.sp.AMPSSpUtil.getString(r1)
            java.util.Map r2 = r11.mapStringToMap(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = ""
            if (r0 == 0) goto L121
            int r5 = r0.size()
            if (r5 <= 0) goto L121
            java.util.Iterator r0 = r0.iterator()
        L3c:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L10d
            java.lang.Object r5 = r0.next()
            java.io.File r5 = (java.io.File) r5
            java.lang.String r6 = r5.getName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "file:"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "File"
            xyz.adscope.common.tool.LogUtil.e(r8, r7)
            boolean r7 = r5.exists()
            if (r7 == 0) goto L102
            if (r2 == 0) goto L102
            int r7 = r2.size()
            if (r7 <= 0) goto L102
            boolean r7 = r2.containsKey(r6)
            if (r7 == 0) goto Lf4
            java.lang.String r7 = "false"
            java.lang.Object r9 = r2.get(r6)
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto Lf4
            java.lang.String r5 = xyz.adscope.common.tool.utils.FileUtils.readFileContent(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto Led
            xyz.adscope.amps.model.crash.AMPSCrashRequestModel r7 = new xyz.adscope.amps.model.crash.AMPSCrashRequestModel
            r7.<init>()
            r7.setException(r5)
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r7.setLog_time(r9)
            java.lang.String r9 = "xyz.adscope.common"
            boolean r9 = r5.contains(r9)
            if (r9 == 0) goto Laa
            java.lang.String r9 = "Adscope-COMMON"
            goto Lcb
        Laa:
            java.lang.String r9 = "xyz.adscope.amps"
            boolean r10 = r5.contains(r9)
            if (r10 == 0) goto Lb5
            java.lang.String r9 = "Adscope-ASNP"
            goto Lcb
        Lb5:
            java.lang.String r10 = "xyz.adscope.asms"
            boolean r10 = r5.contains(r10)
            if (r10 == 0) goto Lc0
            java.lang.String r9 = "Adscope-ASMS"
            goto Lcb
        Lc0:
            boolean r9 = r5.contains(r9)
            if (r9 == 0) goto Lc9
            java.lang.String r9 = "Adscope-AMPS"
            goto Lcb
        Lc9:
            java.lang.String r9 = "APP"
        Lcb:
            r7.setAffiliated(r9)
            r3.add(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "affiliated:"
            r7.append(r10)
            r7.append(r9)
            java.lang.String r9 = "\n;execption:"
            r7.append(r9)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            xyz.adscope.common.tool.LogUtil.e(r8, r5)
        Led:
            java.lang.String r5 = "true"
            r2.put(r6, r5)
            goto L3c
        Lf4:
            r2.remove(r6)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L3c
            r5.delete()
            goto L3c
        L102:
            boolean r6 = r5.exists()
            if (r6 == 0) goto L3c
            r5.delete()
            goto L3c
        L10d:
            if (r2 == 0) goto L11d
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L11d
            java.lang.String r0 = r2.toString()
            xyz.adscope.amps.tool.persistent.sp.AMPSSpUtil.put(r1, r0)
            return r3
        L11d:
            xyz.adscope.amps.tool.persistent.sp.AMPSSpUtil.put(r1, r4)
            return r3
        L121:
            if (r2 == 0) goto L12c
            int r0 = r2.size()
            if (r0 <= 0) goto L12c
            xyz.adscope.amps.tool.persistent.sp.AMPSSpUtil.put(r1, r4)
        L12c:
            return r3
    }

    public void init(android.content.Context r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            r1.mDefaultCrashHandler = r0
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.mContext = r2
            return
    }

    public java.util.Map<java.lang.String, java.lang.String> mapStringToMap(java.lang.String r12) {
            r11 = this;
            java.lang.String r0 = "CrashHandler"
            r1 = 0
            java.lang.String r2 = r12.trim()     // Catch: java.lang.Exception -> L4a
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L4a
            if (r2 == 0) goto Le
            return r1
        Le:
            int r2 = r12.length()     // Catch: java.lang.Exception -> L4a
            r3 = 2
            if (r2 < r3) goto L78
            int r2 = r12.length()     // Catch: java.lang.Exception -> L4a
            r4 = 1
            int r2 = r2 - r4
            java.lang.String r12 = r12.substring(r4, r2)     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = ","
            java.lang.String[] r12 = r12.split(r2)     // Catch: java.lang.Exception -> L4a
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Exception -> L4a
            r2.<init>()     // Catch: java.lang.Exception -> L4a
            int r5 = r12.length     // Catch: java.lang.Exception -> L4a
            r6 = 0
            r7 = 0
        L2d:
            if (r7 >= r5) goto L63
            r8 = r12[r7]     // Catch: java.lang.Exception -> L4a
            java.lang.String r9 = "="
            java.lang.String[] r9 = r8.split(r9)     // Catch: java.lang.Exception -> L4a
            int r10 = r9.length     // Catch: java.lang.Exception -> L4a
            if (r10 != r3) goto L4c
            r8 = r9[r6]     // Catch: java.lang.Exception -> L4a
            java.lang.String r8 = r8.trim()     // Catch: java.lang.Exception -> L4a
            r9 = r9[r4]     // Catch: java.lang.Exception -> L4a
            java.lang.String r9 = r9.trim()     // Catch: java.lang.Exception -> L4a
            r2.put(r8, r9)     // Catch: java.lang.Exception -> L4a
            goto L60
        L4a:
            r12 = move-exception
            goto L64
        L4c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4a
            r9.<init>()     // Catch: java.lang.Exception -> L4a
            java.lang.String r10 = "Invalid key-value pair: "
            r9.append(r10)     // Catch: java.lang.Exception -> L4a
            r9.append(r8)     // Catch: java.lang.Exception -> L4a
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Exception -> L4a
            xyz.adscope.common.tool.LogUtil.e(r0, r8)     // Catch: java.lang.Exception -> L4a
        L60:
            int r7 = r7 + 1
            goto L2d
        L63:
            return r2
        L64:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception: "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            xyz.adscope.common.tool.LogUtil.e(r0, r12)
        L78:
            return r1
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread r5, java.lang.Throwable r6) {
            r4 = this;
            java.lang.String r0 = "e : "
            java.lang.String r1 = "CrashHandler"
            r4.handleException(r6)     // Catch: java.lang.Throwable -> L8 java.lang.Exception -> L1c
            goto L2f
        L8:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            xyz.adscope.common.tool.LogUtil.e(r1, r0)
            goto L2f
        L1c:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            xyz.adscope.common.tool.LogUtil.e(r1, r0)
        L2f:
            java.lang.Thread$UncaughtExceptionHandler r0 = r4.mDefaultCrashHandler
            if (r0 == 0) goto L37
            r0.uncaughtException(r5, r6)
            goto L3e
        L37:
            int r5 = android.os.Process.myPid()
            android.os.Process.killProcess(r5)
        L3e:
            return
    }
}
