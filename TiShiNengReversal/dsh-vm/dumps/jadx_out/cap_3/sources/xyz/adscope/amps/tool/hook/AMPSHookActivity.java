package xyz.adscope.amps.tool.hook;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSHookActivity {
    public AMPSHookActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.app.Activity getTopActivity() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L56
            java.lang.String r2 = "currentActivityThread"
            java.lang.reflect.Method r2 = r1.getMethod(r2, r0)     // Catch: java.lang.Exception -> L56
            java.lang.Object r2 = r2.invoke(r0, r0)     // Catch: java.lang.Exception -> L56
            java.lang.String r3 = "mActivities"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch: java.lang.Exception -> L56
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L56
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L56
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L56
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Exception -> L56
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L56
        L29:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L56
            if (r2 == 0) goto L56
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L56
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Exception -> L56
            java.lang.String r5 = "paused"
            java.lang.reflect.Field r5 = r4.getDeclaredField(r5)     // Catch: java.lang.Exception -> L56
            r5.setAccessible(r3)     // Catch: java.lang.Exception -> L56
            boolean r5 = r5.getBoolean(r2)     // Catch: java.lang.Exception -> L56
            if (r5 != 0) goto L29
            java.lang.String r1 = "activity"
            java.lang.reflect.Field r1 = r4.getDeclaredField(r1)     // Catch: java.lang.Exception -> L56
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L56
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L56
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.Exception -> L56
            return r1
        L56:
            return r0
    }
}
