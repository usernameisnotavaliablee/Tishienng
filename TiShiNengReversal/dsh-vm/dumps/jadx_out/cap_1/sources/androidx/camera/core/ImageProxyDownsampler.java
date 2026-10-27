package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ImageProxyDownsampler {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.core.ImageProxyDownsampler$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod = null;

        static {
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod[] r0 = androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.core.ImageProxyDownsampler.AnonymousClass2.$SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod = r0
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod r1 = androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.NEAREST_NEIGHBOR     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.camera.core.ImageProxyDownsampler.AnonymousClass2.$SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod r1 = androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.AVERAGING     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum DownsamplingMethod extends java.lang.Enum<androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod> {
        private static final /* synthetic */ androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod[] $VALUES = null;
        public static final androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod AVERAGING = null;
        public static final androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod NEAREST_NEIGHBOR = null;

        private static /* synthetic */ androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod[] $values() {
                r0 = 2
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod[] r0 = new androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod[r0]
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod r1 = androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.NEAREST_NEIGHBOR
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod r1 = androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.AVERAGING
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod r0 = new androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod
                java.lang.String r1 = "NEAREST_NEIGHBOR"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.NEAREST_NEIGHBOR = r0
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod r0 = new androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod
                java.lang.String r1 = "AVERAGING"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.AVERAGING = r0
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod[] r0 = $values()
                androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.$VALUES = r0
                return
        }

        DownsamplingMethod(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod> r0 = androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod r1 = (androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod) r1
                return r1
        }

        public static androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod[] values() {
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod[] r0 = androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod[] r0 = (androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ForwardingImageProxyImpl extends androidx.camera.core.ForwardingImageProxy {
        private final int mDownsampledHeight;
        private final androidx.camera.core.ImageProxy.PlaneProxy[] mDownsampledPlanes;
        private final int mDownsampledWidth;

        ForwardingImageProxyImpl(androidx.camera.core.ImageProxy r1, androidx.camera.core.ImageProxy.PlaneProxy[] r2, int r3, int r4) {
                r0 = this;
                r0.<init>(r1)
                r0.mDownsampledPlanes = r2
                r0.mDownsampledWidth = r3
                r0.mDownsampledHeight = r4
                return
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getHeight() {
                r1 = this;
                int r0 = r1.mDownsampledHeight
                return r0
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        @androidx.annotation.NonNull
        public androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes() {
                r1 = this;
                androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r1.mDownsampledPlanes
                return r0
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getWidth() {
                r1 = this;
                int r0 = r1.mDownsampledWidth
                return r0
        }
    }

    private ImageProxyDownsampler() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.camera.core.ImageProxy.PlaneProxy createPlaneProxy(int r1, int r2, byte[] r3) {
            androidx.camera.core.ImageProxyDownsampler$1 r0 = new androidx.camera.core.ImageProxyDownsampler$1
            r0.<init>(r3, r1, r2)
            return r0
    }

    static androidx.camera.core.ForwardingImageProxy downsample(androidx.camera.core.ImageProxy r20, int r21, int r22, androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod r23) {
            r0 = r20
            r1 = r21
            r2 = r22
            int r3 = r0.getFormat()
            r4 = 35
            if (r3 != r4) goto L104
            int r3 = r0.getWidth()
            if (r3 < r1) goto Lce
            int r3 = r0.getHeight()
            if (r3 < r2) goto Lce
            int r3 = r0.getWidth()
            if (r3 != r1) goto L30
            int r3 = r0.getHeight()
            if (r3 != r2) goto L30
            androidx.camera.core.ImageProxyDownsampler$ForwardingImageProxyImpl r3 = new androidx.camera.core.ImageProxyDownsampler$ForwardingImageProxyImpl
            androidx.camera.core.ImageProxy$PlaneProxy[] r4 = r0.getPlanes()
            r3.<init>(r0, r4, r1, r2)
            return r3
        L30:
            int r3 = r0.getWidth()
            int r4 = r0.getWidth()
            r5 = 2
            int r4 = r4 / r5
            int r6 = r0.getWidth()
            int r6 = r6 / r5
            int[] r3 = new int[]{r3, r4, r6}
            int r4 = r0.getHeight()
            int r6 = r0.getHeight()
            int r6 = r6 / r5
            int r7 = r0.getHeight()
            int r7 = r7 / r5
            int[] r4 = new int[]{r4, r6, r7}
            int r6 = r1 / 2
            int[] r6 = new int[]{r1, r6, r6}
            int r7 = r2 / 2
            int[] r7 = new int[]{r2, r7, r7}
            r8 = 3
            androidx.camera.core.ImageProxy$PlaneProxy[] r9 = new androidx.camera.core.ImageProxy.PlaneProxy[r8]
            r10 = 0
        L65:
            if (r10 >= r8) goto Lc8
            androidx.camera.core.ImageProxy$PlaneProxy[] r11 = r0.getPlanes()
            r11 = r11[r10]
            java.nio.ByteBuffer r12 = r11.getBuffer()
            r13 = r6[r10]
            r14 = r7[r10]
            int r13 = r13 * r14
            byte[] r13 = new byte[r13]
            int[] r14 = androidx.camera.core.ImageProxyDownsampler.AnonymousClass2.$SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod
            int r15 = r23.ordinal()
            r14 = r14[r15]
            r15 = 1
            if (r14 == r15) goto La4
            if (r14 == r5) goto L89
            r12 = r13
            r11 = 1
            goto Lbd
        L89:
            r17 = r13
            r13 = r3[r10]
            int r14 = r11.getPixelStride()
            r16 = 1
            int r15 = r11.getRowStride()
            r11 = 1
            r16 = r4[r10]
            r18 = r6[r10]
            r19 = r7[r10]
            resizeAveraging(r12, r13, r14, r15, r16, r17, r18, r19)
        La1:
            r12 = r17
            goto Lbd
        La4:
            r17 = r13
            r16 = 1
            r13 = r3[r10]
            int r14 = r11.getPixelStride()
            int r15 = r11.getRowStride()
            r11 = 1
            r16 = r4[r10]
            r18 = r6[r10]
            r19 = r7[r10]
            resizeNearestNeighbor(r12, r13, r14, r15, r16, r17, r18, r19)
            goto La1
        Lbd:
            r13 = r6[r10]
            androidx.camera.core.ImageProxy$PlaneProxy r11 = createPlaneProxy(r13, r11, r12)
            r9[r10] = r11
            int r10 = r10 + 1
            goto L65
        Lc8:
            androidx.camera.core.ImageProxyDownsampler$ForwardingImageProxyImpl r3 = new androidx.camera.core.ImageProxyDownsampler$ForwardingImageProxyImpl
            r3.<init>(r0, r9, r1, r2)
            return r3
        Lce:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Downsampled dimension "
            r4.append(r5)
            android.util.Size r5 = new android.util.Size
            r5.<init>(r1, r2)
            r4.append(r5)
            java.lang.String r1 = " is not <= original dimension "
            r4.append(r1)
            android.util.Size r1 = new android.util.Size
            int r2 = r0.getWidth()
            int r0 = r0.getHeight()
            r1.<init>(r2, r0)
            r4.append(r1)
            java.lang.String r0 = "."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L104:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Only YUV_420_888 format is currently supported."
            r0.<init>(r1)
            throw r0
    }

    private static void resizeAveraging(java.nio.ByteBuffer r16, int r17, int r18, int r19, int r20, byte[] r21, int r22, int r23) {
            r1 = r16
            r0 = r19
            r2 = r20
            r3 = r22
            r4 = r17
            r5 = r23
            float r4 = (float) r4
            float r6 = (float) r3
            float r4 = r4 / r6
            float r6 = (float) r2
            float r7 = (float) r5
            float r6 = r6 / r7
            byte[] r7 = new byte[r0]
            byte[] r8 = new byte[r0]
            int[] r9 = new int[r3]
            r10 = 0
            r11 = 0
        L1a:
            if (r11 >= r3) goto L27
            float r12 = (float) r11
            float r12 = r12 * r4
            int r12 = (int) r12
            int r12 = r12 * r18
            r9[r11] = r12
            int r11 = r11 + 1
            goto L1a
        L27:
            monitor-enter(r16)
            r1.rewind()     // Catch: java.lang.Throwable -> L89
            r4 = 0
        L2c:
            if (r4 >= r5) goto L8f
            float r11 = (float) r4     // Catch: java.lang.Throwable -> L89
            float r11 = r11 * r6
            int r11 = (int) r11     // Catch: java.lang.Throwable -> L89
            int r12 = r2 + (-1)
            int r13 = java.lang.Math.min(r11, r12)     // Catch: java.lang.Throwable -> L89
            int r13 = r13 * r0
            int r11 = r11 + 1
            int r11 = java.lang.Math.min(r11, r12)     // Catch: java.lang.Throwable -> L89
            int r11 = r11 * r0
            int r12 = r4 * r3
            r1.position(r13)     // Catch: java.lang.Throwable -> L89
            int r13 = r1.remaining()     // Catch: java.lang.Throwable -> L89
            int r13 = java.lang.Math.min(r0, r13)     // Catch: java.lang.Throwable -> L89
            r1.get(r7, r10, r13)     // Catch: java.lang.Throwable -> L89
            r1.position(r11)     // Catch: java.lang.Throwable -> L89
            int r11 = r1.remaining()     // Catch: java.lang.Throwable -> L89
            int r11 = java.lang.Math.min(r0, r11)     // Catch: java.lang.Throwable -> L89
            r1.get(r8, r10, r11)     // Catch: java.lang.Throwable -> L89
            r11 = 0
        L61:
            if (r11 >= r3) goto L8b
            r13 = r9[r11]     // Catch: java.lang.Throwable -> L89
            r14 = r7[r13]     // Catch: java.lang.Throwable -> L89
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r15 = r13 + r18
            r15 = r7[r15]     // Catch: java.lang.Throwable -> L89
            r15 = r15 & 255(0xff, float:3.57E-43)
            r10 = r8[r13]     // Catch: java.lang.Throwable -> L89
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r13 = r13 + r18
            r13 = r8[r13]     // Catch: java.lang.Throwable -> L89
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r14 = r14 + r15
            int r14 = r14 + r10
            int r14 = r14 + r13
            int r14 = r14 / 4
            int r10 = r12 + r11
            r13 = r14 & 255(0xff, float:3.57E-43)
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L89
            r21[r10] = r13     // Catch: java.lang.Throwable -> L89
            int r11 = r11 + 1
            r10 = 0
            goto L61
        L89:
            r0 = move-exception
            goto L91
        L8b:
            int r4 = r4 + 1
            r10 = 0
            goto L2c
        L8f:
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L89
            return
        L91:
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L89
            throw r0
    }

    private static void resizeNearestNeighbor(java.nio.ByteBuffer r7, int r8, int r9, int r10, int r11, byte[] r12, int r13, int r14) {
            float r8 = (float) r8
            float r0 = (float) r13
            float r8 = r8 / r0
            float r0 = (float) r11
            float r1 = (float) r14
            float r0 = r0 / r1
            byte[] r1 = new byte[r10]
            int[] r2 = new int[r13]
            r3 = 0
            r4 = 0
        Lc:
            if (r4 >= r13) goto L19
            float r5 = (float) r4
            float r5 = r5 * r8
            int r5 = (int) r5
            int r5 = r5 * r9
            r2[r4] = r5
            int r4 = r4 + 1
            goto Lc
        L19:
            monitor-enter(r7)
            r7.rewind()     // Catch: java.lang.Throwable -> L4a
            r8 = 0
        L1e:
            if (r8 >= r14) goto L4f
            float r9 = (float) r8     // Catch: java.lang.Throwable -> L4a
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L4a
            int r4 = r11 + (-1)
            int r9 = java.lang.Math.min(r9, r4)     // Catch: java.lang.Throwable -> L4a
            int r9 = r9 * r10
            int r4 = r8 * r13
            r7.position(r9)     // Catch: java.lang.Throwable -> L4a
            int r9 = r7.remaining()     // Catch: java.lang.Throwable -> L4a
            int r9 = java.lang.Math.min(r10, r9)     // Catch: java.lang.Throwable -> L4a
            r7.get(r1, r3, r9)     // Catch: java.lang.Throwable -> L4a
            r9 = 0
        L3d:
            if (r9 >= r13) goto L4c
            int r5 = r4 + r9
            r6 = r2[r9]     // Catch: java.lang.Throwable -> L4a
            r6 = r1[r6]     // Catch: java.lang.Throwable -> L4a
            r12[r5] = r6     // Catch: java.lang.Throwable -> L4a
            int r9 = r9 + 1
            goto L3d
        L4a:
            r8 = move-exception
            goto L51
        L4c:
            int r8 = r8 + 1
            goto L1e
        L4f:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4a
            return
        L51:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4a
            throw r8
    }
}
