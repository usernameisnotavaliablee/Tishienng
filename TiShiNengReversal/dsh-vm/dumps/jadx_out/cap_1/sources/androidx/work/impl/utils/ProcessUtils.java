package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ProcessUtils {
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "ProcessUtils"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.ProcessUtils.TAG = r0
            return
    }

    private ProcessUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    public static java.lang.String getProcessName(@androidx.annotation.NonNull android.content.Context r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.String r6 = androidx.work.impl.utils.d.a()
            return r6
        Lb:
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.String r3 = "android.app.ActivityThread"
            java.lang.Class<androidx.work.impl.utils.ProcessUtils> r4 = androidx.work.impl.utils.ProcessUtils.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L2e
            java.lang.Class r3 = java.lang.Class.forName(r3, r1, r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "currentProcessName"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.Throwable -> L2e
            r3.setAccessible(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r3 = r3.invoke(r2, r2)     // Catch: java.lang.Throwable -> L2e
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L3e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2e
            return r3
        L2e:
            r3 = move-exception
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r5 = androidx.work.impl.utils.ProcessUtils.TAG
            java.lang.Throwable[] r0 = new java.lang.Throwable[r0]
            r0[r1] = r3
            java.lang.String r1 = "Unable to check ActivityThread for processName"
            r4.debug(r5, r1, r0)
        L3e:
            int r0 = android.os.Process.myPid()
            java.lang.String r1 = "activity"
            java.lang.Object r6 = r6.getSystemService(r1)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            if (r6 == 0) goto L6f
            java.util.List r6 = r6.getRunningAppProcesses()
            if (r6 == 0) goto L6f
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L6f
            java.util.Iterator r6 = r6.iterator()
        L5c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r6.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r3 = r1.pid
            if (r3 != r0) goto L5c
            java.lang.String r6 = r1.processName
            return r6
        L6f:
            return r2
    }

    public static boolean isDefaultProcess(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.work.Configuration r3) {
            java.lang.String r0 = getProcessName(r2)
            java.lang.String r1 = r3.getDefaultProcessName()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L17
            java.lang.String r2 = r3.getDefaultProcessName()
            boolean r2 = android.text.TextUtils.equals(r0, r2)
            return r2
        L17:
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r2 = r2.processName
            boolean r2 = android.text.TextUtils.equals(r0, r2)
            return r2
    }
}
