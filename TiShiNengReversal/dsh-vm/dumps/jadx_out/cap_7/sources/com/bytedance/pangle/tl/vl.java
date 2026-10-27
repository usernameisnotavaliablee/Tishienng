package com.bytedance.pangle.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class vl implements com.bytedance.pangle.tl.qv {
    private static final long j = 0;
    private final long cw;
    private final long r;
    private final java.io.FileDescriptor xt;

    static {
            int r0 = android.system.OsConstants._SC_PAGESIZE
            long r0 = android.system.Os.sysconf(r0)
            com.bytedance.pangle.tl.vl.j = r0
            return
    }

    vl(java.io.FileDescriptor r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.xt = r1
            r0.cw = r2
            r0.r = r4
            return
    }

    @Override // com.bytedance.pangle.tl.qv
    public long j() {
            r2 = this;
            long r0 = r2.r
            return r0
    }

    @Override // com.bytedance.pangle.tl.qv
    public void j(com.bytedance.pangle.tl.oq r18, long r19, int r21) throws java.io.IOException, java.security.DigestException {
            r17 = this;
            r1 = r17
            long r2 = r1.cw
            long r2 = r2 + r19
            long r4 = com.bytedance.pangle.tl.vl.j
            long r6 = r2 / r4
            long r15 = r6 * r4
            long r2 = r2 - r15
            int r3 = (int) r2
            int r0 = r21 + r3
            long r10 = (long) r0
            r4 = 0
            boolean r0 = com.bytedance.pangle.util.g.qv()     // Catch: java.lang.Throwable -> L2d android.system.ErrnoException -> L39
            r6 = 0
            if (r0 == 0) goto L40
            java.lang.Class<android.system.OsConstants> r0 = android.system.OsConstants.class
            java.lang.String r7 = "MAP_POPULATE"
            java.lang.reflect.Field r0 = r0.getField(r7)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L31 java.lang.IllegalAccessException -> L33
            java.lang.Object r0 = com.bytedance.pangle.util.FieldUtils.readField(r0, r6)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L31 java.lang.IllegalAccessException -> L33
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L31 java.lang.IllegalAccessException -> L33
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L31 java.lang.IllegalAccessException -> L33
            goto L41
        L2d:
            r0 = move-exception
            r7 = r4
            goto L141
        L31:
            r0 = move-exception
            goto L35
        L33:
            r0 = move-exception
            goto L3d
        L35:
            com.bytedance.sdk.openadsdk.api.m.j(r0)     // Catch: java.lang.Throwable -> L2d android.system.ErrnoException -> L39
            goto L40
        L39:
            r0 = move-exception
            r7 = r4
            goto L128
        L3d:
            com.bytedance.sdk.openadsdk.api.m.j(r0)     // Catch: java.lang.Throwable -> L2d android.system.ErrnoException -> L39
        L40:
            r0 = 0
        L41:
            int r12 = android.system.OsConstants.PROT_READ     // Catch: java.lang.Throwable -> L2d android.system.ErrnoException -> L39
            int r7 = android.system.OsConstants.MAP_SHARED     // Catch: java.lang.Throwable -> L2d android.system.ErrnoException -> L39
            r13 = r7 | r0
            java.io.FileDescriptor r14 = r1.xt     // Catch: java.lang.Throwable -> L2d android.system.ErrnoException -> L39
            r8 = 0
            long r7 = android.system.Os.mmap(r8, r10, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L2d android.system.ErrnoException -> L39
            boolean r0 = com.bytedance.pangle.util.g.jy()     // Catch: java.lang.Throwable -> L84 android.system.ErrnoException -> Lbf
            r9 = 2
            r12 = 1
            java.lang.Class r13 = java.lang.Long.TYPE
            java.lang.Class r14 = java.lang.Integer.TYPE
            java.lang.String r15 = "java.nio.DirectByteBuffer"
            if (r0 == 0) goto Ld2
            java.lang.Class r0 = java.lang.Class.forName(r15)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            r15 = 5
            r19 = 0
            java.lang.Class[] r2 = new java.lang.Class[r15]     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            r2[r19] = r14     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            r2[r12] = r13     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            java.lang.Class<java.io.FileDescriptor> r13 = java.io.FileDescriptor.class
            r2[r9] = r13     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            java.lang.Class<java.lang.Runnable> r13 = java.lang.Runnable.class
            r14 = 3
            r2[r14] = r13     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            r16 = 4
            r2[r16] = r13     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            java.lang.reflect.Constructor r13 = r0.getConstructor(r2)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            if (r13 != 0) goto L91
            java.lang.reflect.Constructor r13 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            goto L91
        L84:
            r0 = move-exception
            goto L141
        L87:
            r0 = move-exception
            goto Lbb
        L89:
            r0 = move-exception
            goto Lc2
        L8b:
            r0 = move-exception
            goto Lc6
        L8d:
            r0 = move-exception
            goto Lca
        L8f:
            r0 = move-exception
            goto Lce
        L91:
            if (r13 == 0) goto Lb7
            r13.setAccessible(r12)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            long r2 = (long) r3     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            long r2 = r2 + r7
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            java.io.FileDescriptor r3 = r1.xt     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            r15[r19] = r0     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            r15[r12] = r2     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            r15[r9] = r3     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            r15[r14] = r6     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            r15[r16] = r0     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            java.lang.Object r0 = r13.newInstance(r15)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.lang.reflect.InvocationTargetException -> L89 java.lang.InstantiationException -> L8b java.lang.IllegalAccessException -> L8d java.lang.ClassNotFoundException -> L8f
        Lb6:
            r6 = r0
        Lb7:
            r2 = r18
            goto L11c
        Lbb:
            com.bytedance.sdk.openadsdk.api.m.j(r0)     // Catch: java.lang.Throwable -> L84 android.system.ErrnoException -> Lbf
            goto Lb7
        Lbf:
            r0 = move-exception
            goto L128
        Lc2:
            com.bytedance.sdk.openadsdk.api.m.j(r0)     // Catch: java.lang.Throwable -> L84 android.system.ErrnoException -> Lbf
            goto Lb7
        Lc6:
            com.bytedance.sdk.openadsdk.api.m.j(r0)     // Catch: java.lang.Throwable -> L84 android.system.ErrnoException -> Lbf
            goto Lb7
        Lca:
            com.bytedance.sdk.openadsdk.api.m.j(r0)     // Catch: java.lang.Throwable -> L84 android.system.ErrnoException -> Lbf
            goto Lb7
        Lce:
            com.bytedance.sdk.openadsdk.api.m.j(r0)     // Catch: java.lang.Throwable -> L84 android.system.ErrnoException -> Lbf
            goto Lb7
        Ld2:
            r19 = 0
            java.lang.Class r0 = java.lang.Class.forName(r15)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> Lfe java.lang.reflect.InvocationTargetException -> L100 java.lang.InstantiationException -> L102 java.lang.IllegalAccessException -> L104 java.lang.ClassNotFoundException -> L106
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> Lfe java.lang.reflect.InvocationTargetException -> L100 java.lang.InstantiationException -> L102 java.lang.IllegalAccessException -> L104 java.lang.ClassNotFoundException -> L106
            r2[r19] = r13     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> Lfe java.lang.reflect.InvocationTargetException -> L100 java.lang.InstantiationException -> L102 java.lang.IllegalAccessException -> L104 java.lang.ClassNotFoundException -> L106
            r2[r12] = r14     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> Lfe java.lang.reflect.InvocationTargetException -> L100 java.lang.InstantiationException -> L102 java.lang.IllegalAccessException -> L104 java.lang.ClassNotFoundException -> L106
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> Lfe java.lang.reflect.InvocationTargetException -> L100 java.lang.InstantiationException -> L102 java.lang.IllegalAccessException -> L104 java.lang.ClassNotFoundException -> L106
            if (r0 == 0) goto Lb7
            r0.setAccessible(r12)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> Lfe java.lang.reflect.InvocationTargetException -> L100 java.lang.InstantiationException -> L102 java.lang.IllegalAccessException -> L104 java.lang.ClassNotFoundException -> L106
            long r2 = (long) r3     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> Lfe java.lang.reflect.InvocationTargetException -> L100 java.lang.InstantiationException -> L102 java.lang.IllegalAccessException -> L104 java.lang.ClassNotFoundException -> L106
            long r2 = r2 + r7
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> Lfe java.lang.reflect.InvocationTargetException -> L100 java.lang.InstantiationException -> L102 java.lang.IllegalAccessException -> L104 java.lang.ClassNotFoundException -> L106
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> Lfe java.lang.reflect.InvocationTargetException -> L100 java.lang.InstantiationException -> L102 java.lang.IllegalAccessException -> L104 java.lang.ClassNotFoundException -> L106
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> Lfe java.lang.reflect.InvocationTargetException -> L100 java.lang.InstantiationException -> L102 java.lang.IllegalAccessException -> L104 java.lang.ClassNotFoundException -> L106
            r9[r19] = r2     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> Lfe java.lang.reflect.InvocationTargetException -> L100 java.lang.InstantiationException -> L102 java.lang.IllegalAccessException -> L104 java.lang.ClassNotFoundException -> L106
            r9[r12] = r3     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> Lfe java.lang.reflect.InvocationTargetException -> L100 java.lang.InstantiationException -> L102 java.lang.IllegalAccessException -> L104 java.lang.ClassNotFoundException -> L106
            java.lang.Object r0 = r0.newInstance(r9)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> Lfe java.lang.reflect.InvocationTargetException -> L100 java.lang.InstantiationException -> L102 java.lang.IllegalAccessException -> L104 java.lang.ClassNotFoundException -> L106
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> Lfe java.lang.reflect.InvocationTargetException -> L100 java.lang.InstantiationException -> L102 java.lang.IllegalAccessException -> L104 java.lang.ClassNotFoundException -> L106
            goto Lb6
        Lfe:
            r0 = move-exception
            goto L108
        L100:
            r0 = move-exception
            goto L10c
        L102:
            r0 = move-exception
            goto L110
        L104:
            r0 = move-exception
            goto L114
        L106:
            r0 = move-exception
            goto L118
        L108:
            com.bytedance.sdk.openadsdk.api.m.j(r0)     // Catch: java.lang.Throwable -> L84 android.system.ErrnoException -> Lbf
            goto Lb7
        L10c:
            com.bytedance.sdk.openadsdk.api.m.j(r0)     // Catch: java.lang.Throwable -> L84 android.system.ErrnoException -> Lbf
            goto Lb7
        L110:
            com.bytedance.sdk.openadsdk.api.m.j(r0)     // Catch: java.lang.Throwable -> L84 android.system.ErrnoException -> Lbf
            goto Lb7
        L114:
            com.bytedance.sdk.openadsdk.api.m.j(r0)     // Catch: java.lang.Throwable -> L84 android.system.ErrnoException -> Lbf
            goto Lb7
        L118:
            com.bytedance.sdk.openadsdk.api.m.j(r0)     // Catch: java.lang.Throwable -> L84 android.system.ErrnoException -> Lbf
            goto Lb7
        L11c:
            r2.j(r6)     // Catch: java.lang.Throwable -> L84 android.system.ErrnoException -> Lbf
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L127
            android.system.Os.munmap(r7, r10)     // Catch: android.system.ErrnoException -> L127
        L127:
            return
        L128:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = "Failed to mmap "
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L84
            r3.append(r10)     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = " bytes"
            r3.append(r6)     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L84
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L84
            throw r2     // Catch: java.lang.Throwable -> L84
        L141:
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 == 0) goto L148
            android.system.Os.munmap(r7, r10)     // Catch: android.system.ErrnoException -> L148
        L148:
            throw r0
    }
}
