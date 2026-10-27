package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class i<DataType, ResourceType, Transcode> {
    private static final java.lang.String f = "DecodePath";
    private final java.lang.Class<DataType> a;
    private final java.util.List<? extends com.bumptech.glide.load.g<DataType, ResourceType>> b;
    private final com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> c;
    private final androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> d;
    private final java.lang.String e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface a<ResourceType> {
        @androidx.annotation.NonNull
        com.bumptech.glide.load.engine.u<ResourceType> a(@androidx.annotation.NonNull com.bumptech.glide.load.engine.u<ResourceType> r1);
    }

    public i(java.lang.Class<DataType> r1, java.lang.Class<ResourceType> r2, java.lang.Class<Transcode> r3, java.util.List<? extends com.bumptech.glide.load.g<DataType, ResourceType>> r4, com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> r5, androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r4
            r0.c = r5
            r0.d = r6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed DecodePath{"
            r4.append(r5)
            java.lang.String r1 = r1.getSimpleName()
            r4.append(r1)
            java.lang.String r1 = "->"
            r4.append(r1)
            java.lang.String r2 = r2.getSimpleName()
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r3.getSimpleName()
            r4.append(r1)
            java.lang.String r1 = "}"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.e = r1
            return
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.load.engine.u<ResourceType> b(com.bumptech.glide.load.data.e<DataType> r8, int r9, int r10, @androidx.annotation.NonNull com.bumptech.glide.load.f r11) throws com.bumptech.glide.load.engine.GlideException {
            r7 = this;
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r0 = r7.d
            java.lang.Object r0 = r0.acquire()
            java.lang.Object r0 = com.bumptech.glide.util.k.d(r0)
            r6 = r0
            java.util.List r6 = (java.util.List) r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            com.bumptech.glide.load.engine.u r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1c
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r9 = r1.d
            r9.release(r6)
            return r8
        L1c:
            r0 = move-exception
            r8 = r0
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r9 = r1.d
            r9.release(r6)
            throw r8
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.load.engine.u<ResourceType> c(com.bumptech.glide.load.data.e<DataType> r8, int r9, int r10, @androidx.annotation.NonNull com.bumptech.glide.load.f r11, java.util.List<java.lang.Throwable> r12) throws com.bumptech.glide.load.engine.GlideException {
            r7 = this;
            java.util.List<? extends com.bumptech.glide.load.g<DataType, ResourceType>> r0 = r7.b
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3f
            java.util.List<? extends com.bumptech.glide.load.g<DataType, ResourceType>> r3 = r7.b
            java.lang.Object r3 = r3.get(r2)
            com.bumptech.glide.load.g r3 = (com.bumptech.glide.load.g) r3
            java.lang.Object r4 = r8.a()     // Catch: java.lang.OutOfMemoryError -> L25 java.lang.RuntimeException -> L27 java.io.IOException -> L29
            boolean r4 = r3.a(r4, r11)     // Catch: java.lang.OutOfMemoryError -> L25 java.lang.RuntimeException -> L27 java.io.IOException -> L29
            if (r4 == 0) goto L39
            java.lang.Object r4 = r8.a()     // Catch: java.lang.OutOfMemoryError -> L25 java.lang.RuntimeException -> L27 java.io.IOException -> L29
            com.bumptech.glide.load.engine.u r1 = r3.b(r4, r9, r10, r11)     // Catch: java.lang.OutOfMemoryError -> L25 java.lang.RuntimeException -> L27 java.io.IOException -> L29
            goto L39
        L25:
            r4 = move-exception
            goto L2a
        L27:
            r4 = move-exception
            goto L2a
        L29:
            r4 = move-exception
        L2a:
            java.lang.String r5 = "DecodePath"
            r6 = 2
            boolean r5 = android.util.Log.isLoggable(r5, r6)
            if (r5 == 0) goto L36
            java.util.Objects.toString(r3)
        L36:
            r12.add(r4)
        L39:
            if (r1 == 0) goto L3c
            goto L3f
        L3c:
            int r2 = r2 + 1
            goto L8
        L3f:
            if (r1 == 0) goto L42
            return r1
        L42:
            com.bumptech.glide.load.engine.GlideException r8 = new com.bumptech.glide.load.engine.GlideException
            java.lang.String r9 = r7.e
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r12)
            r8.<init>(r9, r10)
            throw r8
    }

    public com.bumptech.glide.load.engine.u<Transcode> a(com.bumptech.glide.load.data.e<DataType> r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4, com.bumptech.glide.load.engine.i.a<ResourceType> r5) throws com.bumptech.glide.load.engine.GlideException {
            r0 = this;
            com.bumptech.glide.load.engine.u r1 = r0.b(r1, r2, r3, r4)
            com.bumptech.glide.load.engine.u r1 = r5.a(r1)
            com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> r2 = r0.c
            com.bumptech.glide.load.engine.u r1 = r2.a(r1, r4)
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DecodePath{ dataClass="
            r0.append(r1)
            java.lang.Class<DataType> r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", decoders="
            r0.append(r1)
            java.util.List<? extends com.bumptech.glide.load.g<DataType, ResourceType>> r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", transcoder="
            r0.append(r1)
            com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> r1 = r2.c
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
