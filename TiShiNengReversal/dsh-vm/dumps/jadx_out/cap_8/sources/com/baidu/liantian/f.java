package com.baidu.liantian;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class f {
    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.reflect.Field a(java.lang.Class<?> r0, java.lang.String r1) {
            java.lang.reflect.Field r0 = b(r0, r1)     // Catch: java.lang.NoSuchFieldException -> L5
            return r0
        L5:
            com.baidu.liantian.b.e.a()
            r0 = 0
            return r0
    }

    public static java.lang.reflect.Method a(java.lang.Class<?> r0, java.lang.String r1, java.lang.Class<?>... r2) {
            java.lang.reflect.Method r0 = b(r0, r1, r2)     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> La
            return r0
        L9:
            r0 = 0
        La:
            com.baidu.liantian.b.e.a()
            return r0
    }

    public static boolean a(android.app.Activity r9, android.app.Activity r10) {
            r0 = 0
            if (r9 == 0) goto L44
            if (r10 != 0) goto L6
            goto L44
        L6:
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
        L8:
            r2 = 1
            if (r1 == 0) goto L43
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r1 == r3) goto L43
            java.lang.reflect.Field[] r3 = r1.getDeclaredFields()
            int r4 = r3.length
            r5 = 0
        L15:
            if (r5 >= r4) goto L3e
            r6 = r3[r5]
            r6.setAccessible(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = "mWindow"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto L30
            android.view.Window r7 = r9.getWindow()     // Catch: java.lang.Throwable -> L38
            r6.set(r10, r7)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L30:
            java.lang.Object r7 = r6.get(r9)     // Catch: java.lang.Throwable -> L38
            r6.set(r10, r7)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            com.baidu.liantian.b.e.a()
        L3b:
            int r5 = r5 + 1
            goto L15
        L3e:
            java.lang.Class r1 = r1.getSuperclass()
            goto L8
        L43:
            return r2
        L44:
            return r0
    }

    public static boolean a(java.lang.Class<?> r7, java.lang.Object r8, java.lang.Object r9) {
            r0 = 0
            if (r8 == 0) goto L2e
            if (r9 != 0) goto L6
            goto L2e
        L6:
            r1 = 1
            if (r7 == 0) goto L2d
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r7 == r2) goto L2d
            java.lang.reflect.Field[] r2 = r7.getDeclaredFields()
            int r3 = r2.length
            r4 = 0
        L13:
            if (r4 >= r3) goto L28
            r5 = r2[r4]
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r6 = r5.get(r8)     // Catch: java.lang.Throwable -> L22
            r5.set(r9, r6)     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            com.baidu.liantian.b.e.a()
        L25:
            int r4 = r4 + 1
            goto L13
        L28:
            java.lang.Class r7 = r7.getSuperclass()
            goto L6
        L2d:
            return r1
        L2e:
            return r0
    }

    private static java.lang.reflect.Field b(java.lang.Class<?> r2, java.lang.String r3) {
            java.lang.reflect.Field r0 = r2.getField(r3)     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto La
            return r0
        L7:
            com.baidu.liantian.b.e.a()
        La:
            if (r2 == 0) goto L1d
            java.lang.reflect.Field r0 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L15
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L15
            return r0
        L15:
            com.baidu.liantian.b.e.a()
            java.lang.Class r2 = r2.getSuperclass()
            goto La
        L1d:
            java.lang.NoSuchFieldException r2 = new java.lang.NoSuchFieldException
            r2.<init>()
            throw r2
    }

    private static java.lang.reflect.Method b(java.lang.Class<?> r2, java.lang.String r3, java.lang.Class<?>... r4) {
            java.lang.reflect.Method r0 = r2.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto La
            return r0
        L7:
            com.baidu.liantian.b.e.a()
        La:
            if (r2 == 0) goto L1d
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L15
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L15
            return r0
        L15:
            com.baidu.liantian.b.e.a()
            java.lang.Class r2 = r2.getSuperclass()
            goto La
        L1d:
            java.lang.NoSuchMethodException r2 = new java.lang.NoSuchMethodException
            r2.<init>()
            throw r2
    }
}
