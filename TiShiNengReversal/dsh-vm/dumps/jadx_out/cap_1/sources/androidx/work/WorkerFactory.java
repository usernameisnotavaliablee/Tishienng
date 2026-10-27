package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class WorkerFactory {
    private static final java.lang.String TAG = null;


    static {
            java.lang.String r0 = "WorkerFactory"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.WorkerFactory.TAG = r0
            return
    }

    public WorkerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static androidx.work.WorkerFactory getDefaultWorkerFactory() {
            androidx.work.WorkerFactory$1 r0 = new androidx.work.WorkerFactory$1
            r0.<init>()
            return r0
    }

    @androidx.annotation.Nullable
    public abstract androidx.work.ListenableWorker createWorker(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull androidx.work.WorkerParameters r3);

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final androidx.work.ListenableWorker createWorkerWithDefaultFallback(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull java.lang.String r11, @androidx.annotation.NonNull androidx.work.WorkerParameters r12) {
            r9 = this;
            androidx.work.ListenableWorker r0 = r9.createWorker(r10, r11, r12)
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L71
            java.lang.Class r4 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L14
            java.lang.Class<androidx.work.ListenableWorker> r5 = androidx.work.ListenableWorker.class
            java.lang.Class r4 = r4.asSubclass(r5)     // Catch: java.lang.Throwable -> L14
            goto L34
        L14:
            r4 = move-exception
            androidx.work.Logger r5 = androidx.work.Logger.get()
            java.lang.String r6 = androidx.work.WorkerFactory.TAG
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Invalid class: "
            r7.append(r8)
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            java.lang.Throwable[] r8 = new java.lang.Throwable[r3]
            r8[r2] = r4
            r5.error(r6, r7, r8)
            r4 = 0
        L34:
            if (r4 == 0) goto L71
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L52
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> L52
            java.lang.Class<androidx.work.WorkerParameters> r6 = androidx.work.WorkerParameters.class
            r5[r3] = r6     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L52
            r5[r2] = r10     // Catch: java.lang.Throwable -> L52
            r5[r3] = r12     // Catch: java.lang.Throwable -> L52
            java.lang.Object r10 = r4.newInstance(r5)     // Catch: java.lang.Throwable -> L52
            androidx.work.ListenableWorker r10 = (androidx.work.ListenableWorker) r10     // Catch: java.lang.Throwable -> L52
            r0 = r10
            goto L71
        L52:
            r10 = move-exception
            androidx.work.Logger r12 = androidx.work.Logger.get()
            java.lang.String r4 = androidx.work.WorkerFactory.TAG
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Could not instantiate "
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            java.lang.Throwable[] r6 = new java.lang.Throwable[r3]
            r6[r2] = r10
            r12.error(r4, r5, r6)
        L71:
            if (r0 == 0) goto L94
            boolean r10 = r0.isUsed()
            if (r10 != 0) goto L7a
            goto L94
        L7a:
            java.lang.Class r10 = r9.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r10
            r12[r3] = r11
            java.lang.String r10 = "WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."
            java.lang.String r10 = java.lang.String.format(r10, r12)
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r10)
            throw r11
        L94:
            return r0
    }
}
