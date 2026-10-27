package com.bytedance.pangle.activity;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class IntentUtils {
    static java.util.HashMap<java.lang.Long, java.lang.ref.WeakReference<android.os.Bundle>> j;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.pangle.activity.IntentUtils.j = r0
            return
    }

    public IntentUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.os.Bundle j(long r1) {
            java.util.HashMap<java.lang.Long, java.lang.ref.WeakReference<android.os.Bundle>> r0 = com.bytedance.pangle.activity.IntentUtils.j
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r0.remove(r1)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L15
            java.lang.Object r1 = r1.get()
            android.os.Bundle r1 = (android.os.Bundle) r1
            return r1
        L15:
            r1 = 0
            return r1
    }

    private static void j(long r1, android.os.Bundle r3) {
            java.util.HashMap<java.lang.Long, java.lang.ref.WeakReference<android.os.Bundle>> r0 = com.bytedance.pangle.activity.IntentUtils.j
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            r0.put(r1, r2)
            return
    }

    public static void j(android.content.Intent r5) {
            java.lang.String r0 = "pangle_use_memory"
            r1 = 0
            long r3 = r5.getLongExtra(r0, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L15
            android.os.Bundle r0 = j(r3)
            if (r0 == 0) goto L15
            r5.putExtras(r0)
        L15:
            return
    }

    public static void j(android.content.Intent r5, java.lang.String r6) {
            java.lang.String r0 = "pangle_use_memory"
            r1 = 0
            long r3 = r5.getLongExtra(r0, r1)
            com.bytedance.pangle.plugin.Plugin r6 = com.bytedance.pangle.Zeus.getPlugin(r6)
            boolean r6 = r6.mUseMemoryForActivityIntent
            if (r6 == 0) goto L18
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L18
            long r3 = java.lang.System.currentTimeMillis()
        L18:
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 == 0) goto L2a
            android.os.Bundle r6 = r5.getExtras()
            r1 = 0
            r5.replaceExtras(r1)
            j(r3, r6)
            r5.putExtra(r0, r3)
        L2a:
            return
    }

    @androidx.annotation.Keep
    public static void setUseMemory(android.content.Intent r3) {
            java.lang.String r0 = "pangle_use_memory"
            long r1 = java.lang.System.currentTimeMillis()
            r3.putExtra(r0, r1)
            return
    }
}
