package com.bytedance.msdk.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    private static final java.util.Map<java.lang.String, java.lang.Boolean> j = null;


    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bytedance.msdk.m.xt.j = r0
            return
    }

    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    private static com.bytedance.msdk.api.r.j.xt.m.j j(com.bytedance.msdk.api.r.j.xt.cw.xt r2, com.bytedance.msdk.j.j.cw r3) {
            com.bytedance.msdk.core.m.j r3 = com.bytedance.msdk.m.xt.j.r()
            java.lang.String r0 = r2.xt()
            com.bytedance.msdk.api.r.j.xt.m.j r3 = r3.j(r0)
            if (r3 != 0) goto L43
            com.bytedance.msdk.core.qv.j r0 = com.bytedance.msdk.core.qv.j.j()
            boolean r0 = r0.cw()
            if (r0 == 0) goto L1e
            com.bytedance.msdk.j.r.j.j r3 = new com.bytedance.msdk.j.r.j.j
            r3.<init>()
            goto L38
        L1e:
            r0 = 0
            boolean r0 = j(r0)
            if (r0 == 0) goto L38
            java.lang.String r0 = r2.cw()     // Catch: java.lang.Throwable -> L38
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> L38
            boolean r1 = r0 instanceof com.bytedance.msdk.api.r.j.xt.m.j     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L38
            com.bytedance.msdk.api.r.j.xt.m.j r0 = (com.bytedance.msdk.api.r.j.xt.m.j) r0     // Catch: java.lang.Throwable -> L38
            r3 = r0
        L38:
            com.bytedance.msdk.core.m.j r0 = com.bytedance.msdk.m.xt.j.r()
            java.lang.String r2 = r2.xt()
            r0.j(r2, r3)
        L43:
            return r3
    }

    public static java.lang.String j(java.lang.Class<?> r9, java.lang.Class<?> r10) {
            java.lang.reflect.Method[] r10 = r10.getMethods()
            int r0 = r10.length
            r1 = 0
            r2 = 0
        L7:
            if (r2 >= r0) goto L56
            r3 = r10[r2]
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            java.lang.reflect.Method[] r5 = r5.getMethods()
            int r6 = r5.length
            r7 = 0
        L18:
            if (r7 >= r6) goto L26
            r8 = r5[r7]
            java.lang.String r8 = r8.getName()
            r4.add(r8)
            int r7 = r7 + 1
            goto L18
        L26:
            java.lang.String r5 = r3.getName()
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L53
            java.lang.String r4 = r3.getName()     // Catch: java.lang.NoSuchMethodException -> L3c
            java.lang.Class[] r5 = r3.getParameterTypes()     // Catch: java.lang.NoSuchMethodException -> L3c
            r9.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L3c
            goto L53
        L3c:
            r9 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "自定义ADN校验API失败接入API不符合版本需求，不符合的API的方法名为 "
            r9.<init>(r10)
            java.lang.String r10 = r3.getName()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            return r9
        L53:
            int r2 = r2 + 1
            goto L7
        L56:
            java.lang.String r9 = ""
            return r9
    }

    public static synchronized void j(android.content.Context r10) {
            java.lang.Class<com.bytedance.msdk.m.xt> r0 = com.bytedance.msdk.m.xt.class
            monitor-enter(r0)
            com.bytedance.msdk.ae.j.xt r1 = com.bytedance.msdk.ae.j.xt.j()     // Catch: java.lang.Throwable -> L40
            java.util.List r1 = r1.xt()     // Catch: java.lang.Throwable -> L40
            r2 = 49013(0xbf75, float:6.8682E-41)
            r3 = 0
            if (r1 == 0) goto L6b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L40
        L15:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L69
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L40
            com.bytedance.msdk.core.oq.j r4 = (com.bytedance.msdk.core.oq.j) r4     // Catch: java.lang.Throwable -> L40
            com.bytedance.msdk.api.r.j.xt.cw.xt r5 = r4.cw()     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = r4.up()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            boolean r6 = xt(r6)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            if (r6 == 0) goto L30
            goto L15
        L30:
            com.bytedance.msdk.m.xt$1 r6 = new com.bytedance.msdk.m.xt$1     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            j(r10, r5, r6)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            java.lang.String r4 = r4.up()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            j(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            goto L15
        L40:
            r10 = move-exception
            goto L79
        L42:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = r5.xt()     // Catch: java.lang.Throwable -> L40
            android.util.Pair r7 = new android.util.Pair     // Catch: java.lang.Throwable -> L40
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L40
            java.lang.String r9 = r4.toString()     // Catch: java.lang.Throwable -> L40
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L40
            com.bytedance.msdk.m.xt.j.j(r6, r7)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.xt()     // Catch: java.lang.Throwable -> L40
            com.bytedance.msdk.api.j r6 = new com.bytedance.msdk.api.j     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L40
            r6.<init>(r2, r4)     // Catch: java.lang.Throwable -> L40
            com.bytedance.msdk.up.m.j(r5, r3, r3, r3, r6)     // Catch: java.lang.Throwable -> L40
            goto L15
        L69:
            monitor-exit(r0)
            return
        L6b:
            java.lang.String r10 = ""
            com.bytedance.msdk.api.j r1 = new com.bytedance.msdk.api.j     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = "获取的自定义Adapter总配置为null"
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L40
            com.bytedance.msdk.up.m.j(r10, r3, r3, r3, r1)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)
            return
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r10
    }

    private static void j(android.content.Context r4, com.bytedance.msdk.api.r.j.xt.cw.xt r5, com.bytedance.msdk.api.r.j.xt.m.j r6) {
            r0 = 49013(0xbf75, float:6.8682E-41)
            r1 = 0
            if (r4 != 0) goto L15
            java.lang.String r4 = r5.xt()
            com.bytedance.msdk.api.j r5 = new com.bytedance.msdk.api.j
            java.lang.String r6 = "context为null"
            r5.<init>(r0, r6)
            com.bytedance.msdk.up.m.j(r4, r1, r1, r1, r5)
            return
        L15:
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            com.bytedance.msdk.core.j r2 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Exception -> L29
            java.util.Map r2 = r2.la()     // Catch: java.lang.Exception -> L29
            r6.xt(r4, r5, r2)     // Catch: java.lang.Exception -> L29
            return
        L29:
            r4 = move-exception
            java.lang.String r5 = r5.xt()
            com.bytedance.msdk.api.j r6 = new com.bytedance.msdk.api.j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "调用自定义Adapter初始化方法出现异常 "
            r2.<init>(r3)
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r6.<init>(r0, r2)
            com.bytedance.msdk.up.m.j(r5, r1, r1, r1, r6)
            com.bytedance.sdk.component.utils.vl.j(r4)
            return
    }

    private static void j(android.content.Context r2, com.bytedance.msdk.api.r.j.xt.cw.xt r3, com.bytedance.msdk.j.j.cw r4) throws java.lang.Exception {
            if (r3 == 0) goto L27
            java.lang.String r0 = r3.cw()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L27
            com.bytedance.msdk.api.r.j.xt.m.j r0 = j(r3, r4)
            if (r0 == 0) goto L1f
            boolean r1 = r0.r()
            if (r1 != 0) goto L1b
            j(r2, r3, r0)
        L1b:
            r4.j()
            return
        L1f:
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "GMCustomAdapterConfiguration is null"
            r2.<init>(r3)
            throw r2
        L27:
            if (r3 != 0) goto L31
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "自定义ADN初始化失败，获取的自定义Adapter单条配置为null"
            r2.<init>(r3)
            throw r2
        L31:
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "自定义ADN初始化失败，获取的自定义Adapter单条配置初始化类名为空"
            r2.<init>(r3)
            throw r2
    }

    public static synchronized void j(android.content.Context r1, java.lang.String r2) {
            java.lang.Class<com.bytedance.msdk.m.xt> r0 = com.bytedance.msdk.m.xt.class
            monitor-enter(r0)
            boolean r2 = xt(r2)     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto Lf
            j(r1)     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r1 = move-exception
            goto L11
        Lf:
            monitor-exit(r0)
            return
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    static final synchronized void j(java.lang.String r3) {
            java.lang.Class<com.bytedance.msdk.m.xt> r0 = com.bytedance.msdk.m.xt.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto Lb
            monitor-exit(r0)
            return
        Lb:
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = com.bytedance.msdk.m.xt.j     // Catch: java.lang.Throwable -> L14
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L14
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return
        L14:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    private static boolean j(java.lang.Class<?> r2) {
            java.lang.Class<com.bytedance.msdk.api.r.j.xt.m.j> r0 = com.bytedance.msdk.api.r.j.xt.m.j.class
            boolean r0 = xt(r2, r0)
            if (r0 != 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "自定义ADN初始化失败  ---------  初始化类 "
            r0.<init>(r1)
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            java.lang.String r2 = " 需要继承自自定义ADN的初始化Adapter类 "
            r0.append(r2)
            java.lang.Class<com.bytedance.msdk.api.r.j.xt.m.j> r2 = com.bytedance.msdk.api.r.j.xt.m.j.class
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            goto L2f
        L29:
            java.lang.Class<com.bytedance.msdk.api.r.j.xt.m.j> r0 = com.bytedance.msdk.api.r.j.xt.m.j.class
            java.lang.String r2 = j(r2, r0)
        L2f:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L4a
            java.lang.String r0 = "TTMediationSDK_SDK_Init"
            com.bytedance.msdk.j.up.cw.r(r0, r2)
            com.bytedance.msdk.api.j r0 = new com.bytedance.msdk.api.j
            r1 = 49013(0xbf75, float:6.8682E-41)
            r0.<init>(r1, r2)
            java.lang.String r2 = ""
            r1 = 0
            com.bytedance.msdk.up.m.j(r2, r1, r1, r1, r0)
            r2 = 0
            return r2
        L4a:
            r2 = 1
            return r2
    }

    public static boolean xt(java.lang.Class<?> r0, java.lang.Class<?> r1) {
            java.lang.Class r0 = r0.getSuperclass()
        L4:
            if (r0 == 0) goto Lf
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        Lf:
            r0 = 0
            return r0
    }

    public static final synchronized boolean xt(java.lang.String r3) {
            java.lang.Class<com.bytedance.msdk.m.xt> r0 = com.bytedance.msdk.m.xt.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            if (r1 == 0) goto Lc
            monitor-exit(r0)
            return r2
        Lc:
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = com.bytedance.msdk.m.xt.j     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L1e
            if (r3 != 0) goto L18
            monitor-exit(r0)
            return r2
        L18:
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return r3
        L1e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3
    }
}
