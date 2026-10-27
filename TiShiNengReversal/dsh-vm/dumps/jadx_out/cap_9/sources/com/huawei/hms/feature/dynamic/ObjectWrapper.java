package com.huawei.hms.feature.dynamic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ObjectWrapper<T> extends com.huawei.hms.feature.dynamic.IObjectWrapper.Stub {
    public final T a;

    public ObjectWrapper(T r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static <T> T unwrap(com.huawei.hms.feature.dynamic.IObjectWrapper r6) {
            boolean r0 = r6 instanceof com.huawei.hms.feature.dynamic.ObjectWrapper
            if (r0 == 0) goto L9
            com.huawei.hms.feature.dynamic.ObjectWrapper r6 = (com.huawei.hms.feature.dynamic.ObjectWrapper) r6
            T r6 = r6.a
            return r6
        L9:
            android.os.IBinder r6 = r6.asBinder()
            java.lang.Class r0 = r6.getClass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = 0
        L19:
            if (r3 >= r1) goto L28
            r5 = r0[r3]
            boolean r5 = r5.isSynthetic()
            if (r5 != 0) goto L25
            int r4 = r4 + 1
        L25:
            int r3 = r3 + 1
            goto L19
        L28:
            r1 = 1
            if (r4 != r1) goto L4f
            r3 = r0[r2]
            boolean r3 = r3.isAccessible()
            if (r3 != 0) goto L47
            r3 = r0[r2]
            r3.setAccessible(r1)
            r0 = r0[r2]     // Catch: java.lang.Exception -> L3f
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Exception -> L3f
            return r6
        L3f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Get binder failed: null or not permitted."
            r6.<init>(r0)
            throw r6
        L47:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The field is accessible."
            r6.<init>(r0)
            throw r6
        L4f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Got "
            r1.append(r2)
            int r0 = r0.length
            r1.append(r0)
            java.lang.String r0 = " fields, The number of field number should be 1."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
    }

    public static <T> com.huawei.hms.feature.dynamic.IObjectWrapper wrap(T r1) {
            com.huawei.hms.feature.dynamic.ObjectWrapper r0 = new com.huawei.hms.feature.dynamic.ObjectWrapper
            r0.<init>(r1)
            return r0
    }
}
