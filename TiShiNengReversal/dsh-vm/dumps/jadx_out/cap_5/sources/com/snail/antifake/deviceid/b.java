package com.snail.antifake.deviceid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.Object r3) throws java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r1 = "getInterfaceDescriptor"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)
            java.lang.Object r3 = r0.invoke(r3, r2)
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    public static int b(java.lang.Object r1, java.lang.String r2) throws android.os.RemoteException, java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Class r0 = r1.getClass()
            java.lang.Class r0 = r0.getEnclosingClass()
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)
            r0 = 1
            r2.setAccessible(r0)
            java.lang.Object r1 = r2.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }
}
