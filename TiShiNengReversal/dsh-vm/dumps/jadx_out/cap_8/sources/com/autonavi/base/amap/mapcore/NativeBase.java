package com.autonavi.base.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class NativeBase {
    private static final java.lang.String CREATE_OVERLAY = "createOverlay";
    private static final int LOG_SIZE = 10;
    private static final int STACK_NUMBER = 3;
    private static final java.lang.String UPDATE_OPTIONS = "updateOptions";
    protected volatile boolean destroy;
    private int logSizeCount;
    private boolean mCalledFuntion;
    java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeBase.Method> methodMap;
    java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> runnableArrayList;
    protected boolean useRunnable;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Method {
        private boolean baseClass;
        private java.lang.Class<?>[] clazz;
        private java.lang.String methodName;
        private java.lang.Object object;
        private java.lang.Object[] param;

        public Method(java.lang.Object r3, java.lang.String r4, boolean r5, java.lang.Object... r6) {
                r2 = this;
                r2.<init>()
                r2.object = r3
                r2.methodName = r4
                r2.baseClass = r5
                if (r6 == 0) goto L6c
                int r3 = r6.length     // Catch: java.lang.Throwable -> L6c
                if (r3 <= 0) goto L6c
                int r3 = r6.length     // Catch: java.lang.Throwable -> L6c
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L6c
                r2.clazz = r3     // Catch: java.lang.Throwable -> L6c
                java.lang.String r3 = "createOverlay"
                boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L6c
                r0 = 1
                if (r3 != 0) goto L24
                java.lang.String r3 = "updateOptions"
                boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L6c
                if (r3 == 0) goto L25
            L24:
                r5 = 1
            L25:
                r3 = 0
                if (r5 == 0) goto L4a
                r4 = 0
            L29:
                int r5 = r6.length     // Catch: java.lang.Throwable -> L6c
                if (r4 >= r5) goto L5b
                if (r4 != r0) goto L3d
                java.lang.Class<?>[] r5 = r2.clazz     // Catch: java.lang.Throwable -> L6c
                r1 = r6[r4]     // Catch: java.lang.Throwable -> L6c
                java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L6c
                java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.Throwable -> L6c
                r5[r4] = r1     // Catch: java.lang.Throwable -> L6c
                goto L47
            L3d:
                java.lang.Class<?>[] r5 = r2.clazz     // Catch: java.lang.Throwable -> L6c
                r1 = r6[r4]     // Catch: java.lang.Throwable -> L6c
                java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L6c
                r5[r4] = r1     // Catch: java.lang.Throwable -> L6c
            L47:
                int r4 = r4 + 1
                goto L29
            L4a:
                r4 = 0
            L4b:
                int r5 = r6.length     // Catch: java.lang.Throwable -> L6c
                if (r4 >= r5) goto L5b
                java.lang.Class<?>[] r5 = r2.clazz     // Catch: java.lang.Throwable -> L6c
                r0 = r6[r4]     // Catch: java.lang.Throwable -> L6c
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L6c
                r5[r4] = r0     // Catch: java.lang.Throwable -> L6c
                int r4 = r4 + 1
                goto L4b
            L5b:
                int r4 = r6.length     // Catch: java.lang.Throwable -> L6c
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L6c
                r2.param = r4     // Catch: java.lang.Throwable -> L6c
            L60:
                int r4 = r6.length     // Catch: java.lang.Throwable -> L6c
                if (r3 >= r4) goto L6c
                java.lang.Object[] r4 = r2.param     // Catch: java.lang.Throwable -> L6c
                r5 = r6[r3]     // Catch: java.lang.Throwable -> L6c
                r4[r3] = r5     // Catch: java.lang.Throwable -> L6c
                int r3 = r3 + 1
                goto L60
            L6c:
                return
        }

        static /* synthetic */ java.lang.Object access$000(com.autonavi.base.amap.mapcore.NativeBase.Method r0) {
                java.lang.Object r0 = r0.object
                return r0
        }

        static /* synthetic */ java.lang.String access$100(com.autonavi.base.amap.mapcore.NativeBase.Method r0) {
                java.lang.String r0 = r0.methodName
                return r0
        }

        static /* synthetic */ java.lang.Class[] access$200(com.autonavi.base.amap.mapcore.NativeBase.Method r0) {
                java.lang.Class<?>[] r0 = r0.clazz
                return r0
        }

        static /* synthetic */ java.lang.Object[] access$300(com.autonavi.base.amap.mapcore.NativeBase.Method r0) {
                java.lang.Object[] r0 = r0.param
                return r0
        }
    }

    public NativeBase() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mCalledFuntion = r0
            r1 = 1
            r2.useRunnable = r1
            r2.destroy = r0
            r2.logSizeCount = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.methodMap = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.runnableArrayList = r0
            return
    }

    public synchronized void callAllFunction() {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.isReady()     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L92
            boolean r0 = r6.destroy     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto Ld
            goto L92
        Ld:
            boolean r0 = r6.mCalledFuntion     // Catch: java.lang.Throwable -> L90
            r1 = 1
            if (r0 != r1) goto L14
            monitor-exit(r6)
            return
        L14:
            r6.mCalledFuntion = r1     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r6.useRunnable     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L44
        L1a:
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> r0 = r6.runnableArrayList     // Catch: java.lang.Throwable -> L8e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L8e
            if (r0 <= 0) goto L40
            boolean r0 = r6.destroy     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto L40
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> r0 = r6.runnableArrayList     // Catch: java.lang.Throwable -> L8e
            r2 = 0
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L8e
            com.autonavi.base.amap.mapcore.NativeFunctionRunnable r0 = (com.autonavi.base.amap.mapcore.NativeFunctionRunnable) r0     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L3a
            java.lang.Runnable r0 = r0.getRunnable()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L3a
            r0.run()     // Catch: java.lang.Throwable -> L8e
        L3a:
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> r0 = r6.runnableArrayList     // Catch: java.lang.Throwable -> L8e
            r0.remove(r2)     // Catch: java.lang.Throwable -> L8e
            goto L1a
        L40:
            r6.logSizeCount = r1     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r6)
            return
        L44:
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeBase$Method> r0 = r6.methodMap     // Catch: java.lang.Throwable -> L8e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L8e
        L4a:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L87
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L8e
            com.autonavi.base.amap.mapcore.NativeBase$Method r2 = (com.autonavi.base.amap.mapcore.NativeBase.Method) r2     // Catch: java.lang.Throwable -> L8e
            boolean r3 = r6.destroy     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L5b
            goto L87
        L5b:
            java.lang.Object r3 = com.autonavi.base.amap.mapcore.NativeBase.Method.access$000(r2)     // Catch: java.lang.Throwable -> L4a
            if (r3 != 0) goto L62
            goto L4a
        L62:
            java.lang.Object r3 = com.autonavi.base.amap.mapcore.NativeBase.Method.access$000(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = com.autonavi.base.amap.mapcore.NativeBase.Method.access$100(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.Class[] r5 = com.autonavi.base.amap.mapcore.NativeBase.Method.access$200(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L4a
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r4 = com.autonavi.base.amap.mapcore.NativeBase.Method.access$000(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object[] r2 = com.autonavi.base.amap.mapcore.NativeBase.Method.access$300(r2)     // Catch: java.lang.Throwable -> L4a
            r3.invoke(r4, r2)     // Catch: java.lang.Throwable -> L4a
            goto L4a
        L87:
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeBase$Method> r0 = r6.methodMap     // Catch: java.lang.Throwable -> L8e
            r0.clear()     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r6)
            return
        L8e:
            monitor-exit(r6)
            return
        L90:
            r0 = move-exception
            goto L94
        L92:
            monitor-exit(r6)
            return
        L94:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L90
            throw r0
    }

    protected abstract void createNative();

    public void destroy() {
            r1 = this;
            r0 = 1
            r1.destroy = r0
            monitor-enter(r1)
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> r0 = r1.runnableArrayList     // Catch: java.lang.Throwable -> L10
            r0.clear()     // Catch: java.lang.Throwable -> L10
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeBase$Method> r0 = r1.methodMap     // Catch: java.lang.Throwable -> L10
            r0.clear()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    protected void finalize() throws java.lang.Throwable {
            r1 = this;
            super.finalize()
            r1.finalizeNative()     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            r0.toString()
            return
    }

    protected abstract void finalizeNative();

    public int findRunnableIndex(com.autonavi.base.amap.mapcore.NativeFunctionRunnable r5) {
            r4 = this;
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> r0 = r4.runnableArrayList
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r5 != 0) goto L9
            return r1
        L9:
            r0 = 0
        La:
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> r2 = r4.runnableArrayList
            int r2 = r2.size()
            if (r0 >= r2) goto L2e
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> r2 = r4.runnableArrayList
            java.lang.Object r2 = r2.get(r0)
            com.autonavi.base.amap.mapcore.NativeFunctionRunnable r2 = (com.autonavi.base.amap.mapcore.NativeFunctionRunnable) r2
            if (r2 == 0) goto L2b
            java.lang.String r2 = r2.getKey()
            java.lang.String r3 = r5.getKey()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2b
            return r0
        L2b:
            int r0 = r0 + 1
            goto La
        L2e:
            return r1
    }

    protected abstract long getNative();

    protected boolean isReady() {
            r5 = this;
            long r0 = r5.getNative()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public synchronized void storeUncallFunction(java.lang.Object r3, java.lang.Object r4, java.lang.String r5, java.lang.String r6, java.lang.Object... r7) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.useRunnable     // Catch: java.lang.Throwable -> L6c
            r1 = 0
            if (r0 == 0) goto L4a
            if (r4 == 0) goto L4a
            com.autonavi.base.amap.mapcore.NativeFunctionRunnable r3 = new com.autonavi.base.amap.mapcore.NativeFunctionRunnable     // Catch: java.lang.Throwable -> L6c
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L6c
            r3.<init>(r6, r5, r4)     // Catch: java.lang.Throwable -> L6c
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> r4 = r2.runnableArrayList     // Catch: java.lang.Throwable -> L6c
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L6c
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> r5 = r2.runnableArrayList     // Catch: java.lang.Throwable -> L34
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L34
            int r6 = r2.logSizeCount     // Catch: java.lang.Throwable -> L34
            int r6 = r6 * 10
            if (r5 <= r6) goto L36
            java.lang.String r6 = com.amap.api.col.p0003l.c3.f3065d     // Catch: java.lang.Throwable -> L34
            java.lang.String r7 = "storeUncallFunction size = "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = r7.concat(r5)     // Catch: java.lang.Throwable -> L34
            com.amap.api.col.p0003l.d3.m(r6, r5)     // Catch: java.lang.Throwable -> L34
            int r5 = r2.logSizeCount     // Catch: java.lang.Throwable -> L34
            int r5 = r5 + 1
            r2.logSizeCount = r5     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r3 = move-exception
            goto L48
        L36:
            int r5 = r2.findRunnableIndex(r3)     // Catch: java.lang.Throwable -> L34
            if (r5 < 0) goto L41
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> r6 = r2.runnableArrayList     // Catch: java.lang.Throwable -> L34
            r6.remove(r5)     // Catch: java.lang.Throwable -> L34
        L41:
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> r5 = r2.runnableArrayList     // Catch: java.lang.Throwable -> L34
            r5.add(r3)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
            goto L68
        L48:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
            throw r3     // Catch: java.lang.Throwable -> L6c
        L4a:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L6c
            java.lang.StackTraceElement[] r4 = r4.getStackTrace()     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L68
            int r5 = r4.length     // Catch: java.lang.Throwable -> L6c
            r6 = 3
            if (r5 < r6) goto L68
            com.autonavi.base.amap.mapcore.NativeBase$Method r5 = new com.autonavi.base.amap.mapcore.NativeBase$Method     // Catch: java.lang.Throwable -> L6c
            r4 = r4[r6]     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = r4.getMethodName()     // Catch: java.lang.Throwable -> L6c
            r5.<init>(r3, r4, r1, r7)     // Catch: java.lang.Throwable -> L6c
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeBase$Method> r3 = r2.methodMap     // Catch: java.lang.Throwable -> L6c
            r3.add(r5)     // Catch: java.lang.Throwable -> L6c
        L68:
            r2.mCalledFuntion = r1     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r2)
            return
        L6c:
            monitor-exit(r2)
            return
    }

    public synchronized void storeUncallFunctionArray(java.lang.Object r4, java.lang.Object r5, java.lang.String[] r6, java.lang.String r7, java.lang.Object[] r8) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.useRunnable     // Catch: java.lang.Throwable -> L88
            r1 = 0
            if (r0 == 0) goto L66
            if (r5 == 0) goto L66
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = ""
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L88
            int r8 = r6.length     // Catch: java.lang.Throwable -> L88
            r0 = 0
        L11:
            if (r0 >= r8) goto L20
            r2 = r6[r0]     // Catch: java.lang.Throwable -> L88
            r4.append(r2)     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = ","
            r4.append(r2)     // Catch: java.lang.Throwable -> L88
            int r0 = r0 + 1
            goto L11
        L20:
            com.autonavi.base.amap.mapcore.NativeFunctionRunnable r6 = new com.autonavi.base.amap.mapcore.NativeFunctionRunnable     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.Runnable r5 = (java.lang.Runnable) r5     // Catch: java.lang.Throwable -> L88
            r6.<init>(r7, r4, r5)     // Catch: java.lang.Throwable -> L88
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> r4 = r3.runnableArrayList     // Catch: java.lang.Throwable -> L88
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L88
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> r5 = r3.runnableArrayList     // Catch: java.lang.Throwable -> L50
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L50
            int r7 = r3.logSizeCount     // Catch: java.lang.Throwable -> L50
            int r7 = r7 * 10
            if (r5 <= r7) goto L52
            java.lang.String r7 = com.amap.api.col.p0003l.c3.f3065d     // Catch: java.lang.Throwable -> L50
            java.lang.String r8 = "storeUncallFunctionArray size = "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = r8.concat(r5)     // Catch: java.lang.Throwable -> L50
            com.amap.api.col.p0003l.d3.m(r7, r5)     // Catch: java.lang.Throwable -> L50
            int r5 = r3.logSizeCount     // Catch: java.lang.Throwable -> L50
            int r5 = r5 + 1
            r3.logSizeCount = r5     // Catch: java.lang.Throwable -> L50
            goto L52
        L50:
            r5 = move-exception
            goto L64
        L52:
            int r5 = r3.findRunnableIndex(r6)     // Catch: java.lang.Throwable -> L50
            if (r5 < 0) goto L5d
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> r7 = r3.runnableArrayList     // Catch: java.lang.Throwable -> L50
            r7.remove(r5)     // Catch: java.lang.Throwable -> L50
        L5d:
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeFunctionRunnable> r5 = r3.runnableArrayList     // Catch: java.lang.Throwable -> L50
            r5.add(r6)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L50
            goto L84
        L64:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L50
            throw r5     // Catch: java.lang.Throwable -> L88
        L66:
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L88
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto L84
            int r6 = r5.length     // Catch: java.lang.Throwable -> L88
            r7 = 3
            if (r6 < r7) goto L84
            com.autonavi.base.amap.mapcore.NativeBase$Method r6 = new com.autonavi.base.amap.mapcore.NativeBase$Method     // Catch: java.lang.Throwable -> L88
            r5 = r5[r7]     // Catch: java.lang.Throwable -> L88
            java.lang.String r5 = r5.getMethodName()     // Catch: java.lang.Throwable -> L88
            r6.<init>(r4, r5, r1, r8)     // Catch: java.lang.Throwable -> L88
            java.util.ArrayList<com.autonavi.base.amap.mapcore.NativeBase$Method> r4 = r3.methodMap     // Catch: java.lang.Throwable -> L88
            r4.add(r6)     // Catch: java.lang.Throwable -> L88
        L84:
            r3.mCalledFuntion = r1     // Catch: java.lang.Throwable -> L88
            monitor-exit(r3)
            return
        L88:
            monitor-exit(r3)
            return
    }

    public void validate() {
            r9 = this;
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Method[] r0 = r0.getMethods()
            if (r0 != 0) goto Lb
            goto L59
        Lb:
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r1) goto L59
            r4 = r0[r3]
            java.lang.Class<com.autonavi.base.amap.mapcore.annotations.ParameterIsClass> r5 = com.autonavi.base.amap.mapcore.annotations.ParameterIsClass.class
            boolean r6 = r4.isAnnotationPresent(r5)
            if (r6 == 0) goto L56
            java.lang.annotation.Annotation r5 = r4.getAnnotation(r5)
            com.autonavi.base.amap.mapcore.annotations.ParameterIsClass r5 = (com.autonavi.base.amap.mapcore.annotations.ParameterIsClass) r5
            if (r5 == 0) goto L56
            boolean r5 = r5.required()
            if (r5 == 0) goto L56
            java.lang.Class[] r5 = r4.getParameterTypes()
            if (r5 == 0) goto L56
            int r6 = r5.length
            r7 = 0
        L30:
            if (r7 >= r6) goto L56
            r8 = r5[r7]
            boolean r8 = androidx.activity.k.a(r8)
            if (r8 == 0) goto L3d
            int r7 = r7 + 1
            goto L30
        L3d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "函数："
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = " 参数不是对象类型"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L56:
            int r3 = r3 + 1
            goto Le
        L59:
            return
    }
}
