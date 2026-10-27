package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class m1 extends com.huawei.hms.hatool.s0 {
    public static java.lang.String k() {
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = ""
            java.lang.String r2 = "com.huawei.android.os.BuildEx"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalArgumentException -> L2f java.lang.IllegalAccessException -> L32 java.lang.NoSuchMethodException -> L35 android.util.AndroidRuntimeException -> L38 java.lang.ClassNotFoundException -> L3b
            java.lang.String r3 = "getUDID"
            r4 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalArgumentException -> L2f java.lang.IllegalAccessException -> L32 java.lang.NoSuchMethodException -> L35 android.util.AndroidRuntimeException -> L38 java.lang.ClassNotFoundException -> L3b
            java.lang.Object r2 = r2.invoke(r4, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalArgumentException -> L2f java.lang.IllegalAccessException -> L32 java.lang.NoSuchMethodException -> L35 android.util.AndroidRuntimeException -> L38 java.lang.ClassNotFoundException -> L3b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalArgumentException -> L2f java.lang.IllegalAccessException -> L32 java.lang.NoSuchMethodException -> L35 android.util.AndroidRuntimeException -> L38 java.lang.ClassNotFoundException -> L3b
            java.lang.String r1 = "getUDID success"
            com.huawei.hms.hatool.j1.h(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalArgumentException -> L1f java.lang.IllegalAccessException -> L21 java.lang.NoSuchMethodException -> L23 android.util.AndroidRuntimeException -> L25 java.lang.ClassNotFoundException -> L27
            return r2
        L1d:
            r1 = r2
            goto L29
        L1f:
            r1 = r2
            goto L2f
        L21:
            r1 = r2
            goto L32
        L23:
            r1 = r2
            goto L35
        L25:
            r1 = r2
            goto L38
        L27:
            r1 = r2
            goto L3b
        L29:
            java.lang.String r2 = "getUDID method invoke failed : InvocationTargetException"
        L2b:
            com.huawei.hms.hatool.j1.m(r0, r2)
            goto L3e
        L2f:
            java.lang.String r2 = "getUDID method invoke failed : Illegal ArgumentException"
            goto L2b
        L32:
            java.lang.String r2 = "getUDID method invoke failed : Illegal AccessException"
            goto L2b
        L35:
            java.lang.String r2 = "getUDID method invoke failed : NoSuchMethodException"
            goto L2b
        L38:
            java.lang.String r2 = "getUDID getudid failed, RuntimeException is AndroidRuntimeException"
            goto L2b
        L3b:
            java.lang.String r2 = "getUDID method invoke failed"
            goto L2b
        L3e:
            return r1
    }

    public static android.util.Pair<java.lang.String, java.lang.String> l(android.content.Context r3) {
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r0 = com.huawei.hms.hatool.h.b(r3, r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L17
            java.lang.String r3 = "hmsSdk"
            java.lang.String r0 = "getMccAndMnc() Pair value is empty"
            com.huawei.hms.hatool.j1.m(r3, r0)
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r1)
            return r3
        L17:
            java.lang.String r0 = "phone"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            if (r3 != 0) goto L27
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r1)
            return r3
        L27:
            int r0 = r3.getSimState()
            r2 = 5
            if (r0 == r2) goto L34
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r1)
            return r3
        L34:
            java.lang.String r3 = r3.getNetworkOperator()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L63
            java.lang.String r0 = "null"
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 == 0) goto L47
            goto L63
        L47:
            int r0 = r3.length()
            r2 = 3
            if (r0 <= r2) goto L5d
            r0 = 0
            java.lang.String r0 = r3.substring(r0, r2)
            java.lang.String r3 = r3.substring(r2)
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r0, r3)
            return r1
        L5d:
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r1)
            return r3
        L63:
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r1)
            return r3
    }
}
