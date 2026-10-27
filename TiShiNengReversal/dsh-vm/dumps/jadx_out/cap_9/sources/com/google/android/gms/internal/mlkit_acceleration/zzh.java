package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzh {
    private static final java.util.regex.Pattern zza = null;

    static {
            java.lang.String r0 = "^OpenGL ES(-C[ML])? (\\d)\\.(\\d).*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzh.zza = r0
            return
    }

    public zzh() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final com.google.android.gms.internal.mlkit_acceleration.zzg zza() throws com.google.android.gms.internal.mlkit_acceleration.zze {
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            r1 = r0
            javax.microedition.khronos.egl.EGL10 r1 = (javax.microedition.khronos.egl.EGL10) r1
            if (r1 == 0) goto L183
            javax.microedition.khronos.egl.EGLContext r0 = r1.eglGetCurrentContext()
            javax.microedition.khronos.egl.EGLSurface r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            javax.microedition.khronos.egl.EGLContext r8 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            r9 = 2
            if (r0 == 0) goto L1f
            boolean r2 = r0.equals(r8)
            if (r2 == 0) goto L1b
            goto L1f
        L1b:
            r2 = 0
            r10 = 0
            goto Le9
        L1f:
            java.lang.Object r2 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r2 = r1.eglGetDisplay(r2)
            if (r2 == 0) goto L17c
            javax.microedition.khronos.egl.EGLDisplay r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            if (r2 == r3) goto L17c
            int[] r3 = new int[r9]
            r1.eglInitialize(r2, r3)
            java.lang.String r3 = "egl.eglInitialize"
            zzb(r1, r3)
            r3 = 15
            int[] r3 = new int[r3]
            r3 = {x018a: FILL_ARRAY_DATA , data: [12324, 8, 12323, 8, 12322, 8, 12321, 8, 12326, 8, 12325, 8, 12352, 4, 12344} // fill-array
            r4 = 7
            int[] r4 = new int[r4]
            r4 = {x01ac: FILL_ARRAY_DATA , data: [12326, 8, 12325, 8, 12338, 0, 12344} // fill-array
            int[][] r11 = new int[r9][]
            r12 = 0
            r11[r12] = r3
            r13 = 1
            r11[r13] = r4
            int[][] r14 = new int[r9][]
            r3 = 12440(0x3098, float:1.7432E-41)
            r15 = 12344(0x3038, float:1.7298E-41)
            int[] r4 = new int[]{r3, r9, r15}
            r14[r12] = r4
            int[] r3 = new int[]{r3, r13, r15}
            r14[r13] = r3
            r3 = 0
            r4 = 0
        L5e:
            if (r3 >= r9) goto Lb9
            if (r4 == 0) goto L6a
            if (r4 == r7) goto L6a
            r1.eglMakeCurrent(r2, r7, r7, r8)
            r1.eglDestroySurface(r2, r4)
        L6a:
            if (r0 == 0) goto L71
            if (r0 == r8) goto L71
            r1.eglDestroyContext(r2, r0)
        L71:
            int[] r6 = new int[r13]     // Catch: java.lang.Exception -> Ldd
            r4 = r3
            r3 = r11[r4]     // Catch: java.lang.Exception -> Lda
            r5 = r4
            r4 = 0
            r16 = r5
            r5 = 0
            r10 = r16
            zzc(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> Lc2
            r5 = r6[r12]     // Catch: java.lang.Exception -> Lc2
            javax.microedition.khronos.egl.EGLConfig[] r4 = new javax.microedition.khronos.egl.EGLConfig[r5]     // Catch: java.lang.Exception -> Lc2
            r3 = r11[r10]     // Catch: java.lang.Exception -> Lc2
            zzc(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> Lc2
            r0 = r6[r12]     // Catch: java.lang.Exception -> Lc2
            if (r0 <= 0) goto Lc4
            r0 = r4[r12]     // Catch: java.lang.Exception -> Lc2
            r3 = r14[r10]     // Catch: java.lang.Exception -> Lc2
            javax.microedition.khronos.egl.EGLContext r3 = r1.eglCreateContext(r2, r0, r8, r3)     // Catch: java.lang.Exception -> Lc2
            java.lang.String r0 = "egl.eglCreateContext"
            zzb(r1, r0)     // Catch: java.lang.Exception -> Lbf
            r0 = 12375(0x3057, float:1.7341E-41)
            r5 = 12374(0x3056, float:1.734E-41)
            int[] r0 = new int[]{r0, r9, r5, r9, r15}     // Catch: java.lang.Exception -> Lbf
            r4 = r4[r12]     // Catch: java.lang.Exception -> Lbf
            javax.microedition.khronos.egl.EGLSurface r4 = r1.eglCreatePbufferSurface(r2, r4, r0)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r0 = "egl.eglCreatePbufferSurface"
            zzb(r1, r0)     // Catch: java.lang.Exception -> Lbd
            boolean r0 = r1.eglMakeCurrent(r2, r4, r4, r3)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r5 = "egl.eglMakeCurrent"
            zzb(r1, r5)     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto Lbb
            r0 = r3
        Lb9:
            r10 = r4
            goto Le9
        Lbb:
            r0 = r3
            goto Le4
        Lbd:
            r0 = move-exception
            goto Le1
        Lbf:
            r0 = move-exception
        Lc0:
            r4 = 0
            goto Le1
        Lc2:
            r0 = move-exception
            goto Ldf
        Lc4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc2
            r0.<init>()     // Catch: java.lang.Exception -> Lc2
            java.lang.String r3 = "No matching configs found for set "
            r0.append(r3)     // Catch: java.lang.Exception -> Lc2
            r0.append(r10)     // Catch: java.lang.Exception -> Lc2
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Lc2
            com.google.android.gms.internal.mlkit_acceleration.zze r0 = com.google.android.gms.internal.mlkit_acceleration.zze.zzb(r0)     // Catch: java.lang.Exception -> Lc2
            throw r0     // Catch: java.lang.Exception -> Lc2
        Lda:
            r0 = move-exception
            r10 = r4
            goto Ldf
        Ldd:
            r0 = move-exception
            r10 = r3
        Ldf:
            r3 = 0
            goto Lc0
        Le1:
            if (r10 > 0) goto Le8
            goto Lbb
        Le4:
            int r3 = r10 + 1
            goto L5e
        Le8:
            throw r0
        Le9:
            if (r0 == 0) goto L175
            boolean r3 = r0.equals(r8)
            if (r3 != 0) goto L175
            r3 = 7938(0x1f02, float:1.1124E-41)
            java.lang.String r3 = android.opengl.GLES10.glGetString(r3)
            java.lang.String r4 = "GLES10.glGetString(GLES10.GL_VERSION)"
            zzb(r1, r4)
            r4 = 7937(0x1f01, float:1.1122E-41)
            java.lang.String r4 = android.opengl.GLES10.glGetString(r4)
            java.lang.String r5 = "GLES10.glGetString(GLES10.GL_RENDERER)"
            zzb(r1, r5)
            r5 = 7936(0x1f00, float:1.1121E-41)
            java.lang.String r5 = android.opengl.GLES10.glGetString(r5)
            java.lang.String r6 = "GLES10.glGetString(GLES10.GL_VENDOR)"
            zzb(r1, r6)
            if (r10 == 0) goto L11f
            if (r2 == 0) goto L11f
            r1.eglMakeCurrent(r2, r7, r7, r8)
            r1.eglDestroySurface(r2, r10)
            r1.eglDestroyContext(r2, r0)
        L11f:
            if (r3 == 0) goto L16e
            if (r4 == 0) goto L16e
            if (r5 == 0) goto L16e
            java.util.regex.Pattern r0 = com.google.android.gms.internal.mlkit_acceleration.zzh.zza
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r1 = r0.find()
            if (r1 == 0) goto L163
            int r1 = r0.groupCount()
            r2 = 3
            if (r1 != r2) goto L163
            java.lang.String r1 = r0.group(r9)
            r6 = 10
            int r1 = java.lang.Integer.parseInt(r1, r6)
            java.lang.String r0 = r0.group(r2)
            int r0 = java.lang.Integer.parseInt(r0, r6)
            com.google.android.gms.internal.mlkit_acceleration.zzb r2 = new com.google.android.gms.internal.mlkit_acceleration.zzb
            r2.<init>()
            r2.zzc(r4)
            r2.zzd(r5)
            r2.zze(r3)
            r2.zza(r1)
            r2.zzb(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzg r0 = r2.zzf()
            return r0
        L163:
            java.lang.String r0 = "Failed to parse version from "
            java.lang.String r0 = r0.concat(r3)
            com.google.android.gms.internal.mlkit_acceleration.zze r0 = com.google.android.gms.internal.mlkit_acceleration.zze.zzb(r0)
            throw r0
        L16e:
            java.lang.String r0 = "Got null value for a GL string"
            com.google.android.gms.internal.mlkit_acceleration.zze r0 = com.google.android.gms.internal.mlkit_acceleration.zze.zzb(r0)
            throw r0
        L175:
            java.lang.String r0 = "Finding or creating a context"
            com.google.android.gms.internal.mlkit_acceleration.zze r0 = com.google.android.gms.internal.mlkit_acceleration.zze.zze(r1, r0)
            throw r0
        L17c:
            java.lang.String r0 = "egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY)"
            com.google.android.gms.internal.mlkit_acceleration.zze r0 = com.google.android.gms.internal.mlkit_acceleration.zze.zze(r1, r0)
            throw r0
        L183:
            java.lang.String r0 = "EGLContext.getEGL() returned null"
            com.google.android.gms.internal.mlkit_acceleration.zze r0 = com.google.android.gms.internal.mlkit_acceleration.zze.zzb(r0)
            throw r0
    }

    private static void zzb(javax.microedition.khronos.egl.EGL10 r1, java.lang.String r2) throws com.google.android.gms.internal.mlkit_acceleration.zze {
            int r1 = r1.eglGetError()
            r0 = 12288(0x3000, float:1.7219E-41)
            if (r1 != r0) goto L9
            return
        L9:
            com.google.android.gms.internal.mlkit_acceleration.zze r1 = com.google.android.gms.internal.mlkit_acceleration.zze.zzc(r1, r2)
            throw r1
    }

    private static void zzc(javax.microedition.khronos.egl.EGL10 r1, javax.microedition.khronos.egl.EGLDisplay r2, int[] r3, javax.microedition.khronos.egl.EGLConfig[] r4, int r5, int[] r6) throws com.google.android.gms.internal.mlkit_acceleration.zze {
            r1.eglChooseConfig(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L9
            java.lang.String r2 = "egl.eglChooseConfig"
            zzb(r1, r2)
            return
        L9:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "egl.eglChooseConfig failed with "
            java.lang.String r3 = r1.toString()
            java.lang.String r2 = r2.concat(r3)
            com.google.android.gms.internal.mlkit_acceleration.zze r1 = com.google.android.gms.internal.mlkit_acceleration.zze.zzd(r2, r1)
            throw r1
    }
}
