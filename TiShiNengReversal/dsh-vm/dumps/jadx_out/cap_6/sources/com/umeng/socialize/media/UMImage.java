package com.umeng.socialize.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMImage extends com.umeng.socialize.media.BaseMediaObject {
    public static int BINARY_IMAGE = 5;
    public static int BITMAP_IMAGE = 4;
    public static int FILE_IMAGE = 1;
    public static int MAX_HEIGHT = 1024;
    public static int MAX_WIDTH = 768;
    public static int RES_IMAGE = 3;
    public static int URL_IMAGE = 2;
    public android.graphics.Bitmap.CompressFormat compressFormat;
    public com.umeng.socialize.media.UMImage.CompressStyle compressStyle;
    private com.umeng.socialize.media.UMImage.ConfiguredConvertor f;
    private com.umeng.socialize.media.UMImage g;
    private com.umeng.social.tool.UMImageMark h;
    private int i;
    public boolean isLoadImgByCompress;
    private boolean j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class BinaryConvertor extends com.umeng.socialize.media.UMImage.ConfiguredConvertor {
        final /* synthetic */ com.umeng.socialize.media.UMImage a;
        private byte[] b;

        public BinaryConvertor(com.umeng.socialize.media.UMImage r1, byte[] r2) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.b = r2
                return
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public byte[] asBinary() {
                r1 = this;
                byte[] r0 = r1.b
                return r0
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public android.graphics.Bitmap asBitmap() {
                r1 = this;
                byte[] r0 = r1.asBinary()
                boolean r0 = com.umeng.socialize.utils.SocializeUtils.assertBinaryInvalid(r0)
                if (r0 == 0) goto L13
                byte[] r0 = r1.asBinary()
                android.graphics.Bitmap r0 = com.umeng.socialize.c.a.a.a(r0)
                return r0
            L13:
                r0 = 0
                return r0
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public java.io.File asFile() {
                r1 = this;
                byte[] r0 = r1.asBinary()
                boolean r0 = com.umeng.socialize.utils.SocializeUtils.assertBinaryInvalid(r0)
                if (r0 == 0) goto L13
                byte[] r0 = r1.asBinary()
                java.io.File r0 = com.umeng.socialize.c.a.a.b(r0)
                return r0
            L13:
                r0 = 0
                return r0
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public java.lang.String asUrl() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class BitmapConvertor extends com.umeng.socialize.media.UMImage.ConfiguredConvertor {
        final /* synthetic */ com.umeng.socialize.media.UMImage a;
        private android.graphics.Bitmap b;

        public BitmapConvertor(com.umeng.socialize.media.UMImage r1, android.graphics.Bitmap r2) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.b = r2
                return
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public byte[] asBinary() {
                r2 = this;
                android.graphics.Bitmap r0 = r2.b
                com.umeng.socialize.media.UMImage r1 = r2.a
                android.graphics.Bitmap$CompressFormat r1 = r1.compressFormat
                byte[] r0 = com.umeng.socialize.c.a.a.a(r0, r1)
                return r0
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public android.graphics.Bitmap asBitmap() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.b
                return r0
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public java.io.File asFile() {
                r2 = this;
                android.graphics.Bitmap r0 = r2.b
                com.umeng.socialize.media.UMImage r1 = r2.a
                android.graphics.Bitmap$CompressFormat r1 = r1.compressFormat
                byte[] r0 = com.umeng.socialize.c.a.a.a(r0, r1)
                byte[] r1 = r2.asBinary()
                boolean r1 = com.umeng.socialize.utils.SocializeUtils.assertBinaryInvalid(r1)
                if (r1 == 0) goto L19
                java.io.File r0 = com.umeng.socialize.c.a.a.b(r0)
                return r0
            L19:
                r0 = 0
                return r0
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public java.lang.String asUrl() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum CompressStyle extends java.lang.Enum<com.umeng.socialize.media.UMImage.CompressStyle> {
        public static final com.umeng.socialize.media.UMImage.CompressStyle QUALITY = null;
        public static final com.umeng.socialize.media.UMImage.CompressStyle SCALE = null;
        private static final /* synthetic */ com.umeng.socialize.media.UMImage.CompressStyle[] a = null;

        static {
                com.umeng.socialize.media.UMImage$CompressStyle r0 = new com.umeng.socialize.media.UMImage$CompressStyle
                java.lang.String r1 = "SCALE"
                r2 = 0
                r0.<init>(r1, r2)
                com.umeng.socialize.media.UMImage.CompressStyle.SCALE = r0
                com.umeng.socialize.media.UMImage$CompressStyle r1 = new com.umeng.socialize.media.UMImage$CompressStyle
                java.lang.String r3 = "QUALITY"
                r4 = 1
                r1.<init>(r3, r4)
                com.umeng.socialize.media.UMImage.CompressStyle.QUALITY = r1
                r3 = 2
                com.umeng.socialize.media.UMImage$CompressStyle[] r3 = new com.umeng.socialize.media.UMImage.CompressStyle[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.umeng.socialize.media.UMImage.CompressStyle.a = r3
                return
        }

        CompressStyle(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.umeng.socialize.media.UMImage.CompressStyle valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.socialize.media.UMImage$CompressStyle> r0 = com.umeng.socialize.media.UMImage.CompressStyle.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.socialize.media.UMImage$CompressStyle r1 = (com.umeng.socialize.media.UMImage.CompressStyle) r1
                return r1
        }

        public static com.umeng.socialize.media.UMImage.CompressStyle[] values() {
                com.umeng.socialize.media.UMImage$CompressStyle[] r0 = com.umeng.socialize.media.UMImage.CompressStyle.a
                java.lang.Object r0 = r0.clone()
                com.umeng.socialize.media.UMImage$CompressStyle[] r0 = (com.umeng.socialize.media.UMImage.CompressStyle[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class ConfiguredConvertor implements com.umeng.socialize.media.UMImage.IImageConvertor {
        ConfiguredConvertor() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class FileConvertor extends com.umeng.socialize.media.UMImage.ConfiguredConvertor {
        final /* synthetic */ com.umeng.socialize.media.UMImage a;
        private java.io.File b;

        public FileConvertor(com.umeng.socialize.media.UMImage r1, java.io.File r2) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.b = r2
                return
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public byte[] asBinary() {
                r2 = this;
                java.io.File r0 = r2.b
                com.umeng.socialize.media.UMImage r1 = r2.a
                android.graphics.Bitmap$CompressFormat r1 = r1.compressFormat
                byte[] r0 = com.umeng.socialize.c.a.a.a(r0, r1)
                return r0
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public android.graphics.Bitmap asBitmap() {
                r1 = this;
                byte[] r0 = r1.asBinary()
                boolean r0 = com.umeng.socialize.utils.SocializeUtils.assertBinaryInvalid(r0)
                if (r0 == 0) goto L15
                com.umeng.socialize.media.UMImage r0 = r1.a
                byte[] r0 = r0.asBinImage()
                android.graphics.Bitmap r0 = com.umeng.socialize.c.a.a.a(r0)
                return r0
            L15:
                r0 = 0
                return r0
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public java.io.File asFile() {
                r1 = this;
                java.io.File r0 = r1.b
                return r0
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public java.lang.String asUrl() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface IImageConvertor {
        byte[] asBinary();

        android.graphics.Bitmap asBitmap();

        java.io.File asFile();

        java.lang.String asUrl();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class ResConvertor extends com.umeng.socialize.media.UMImage.ConfiguredConvertor {
        final /* synthetic */ com.umeng.socialize.media.UMImage a;
        private android.content.Context b;
        private int c;

        public ResConvertor(com.umeng.socialize.media.UMImage r1, android.content.Context r2, int r3) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.b = r2
                r0.c = r3
                return
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public byte[] asBinary() {
                r4 = this;
                android.content.Context r0 = r4.b
                int r1 = r4.c
                com.umeng.socialize.media.UMImage r2 = r4.a
                boolean r3 = r2.isLoadImgByCompress
                android.graphics.Bitmap$CompressFormat r2 = r2.compressFormat
                byte[] r0 = com.umeng.socialize.c.a.a.a(r0, r1, r3, r2)
                return r0
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public android.graphics.Bitmap asBitmap() {
                r1 = this;
                byte[] r0 = r1.asBinary()
                boolean r0 = com.umeng.socialize.utils.SocializeUtils.assertBinaryInvalid(r0)
                if (r0 == 0) goto L13
                byte[] r0 = r1.asBinary()
                android.graphics.Bitmap r0 = com.umeng.socialize.c.a.a.a(r0)
                return r0
            L13:
                r0 = 0
                return r0
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public java.io.File asFile() {
                r1 = this;
                byte[] r0 = r1.asBinary()
                boolean r0 = com.umeng.socialize.utils.SocializeUtils.assertBinaryInvalid(r0)
                if (r0 == 0) goto L13
                byte[] r0 = r1.asBinary()
                java.io.File r0 = com.umeng.socialize.c.a.a.b(r0)
                return r0
            L13:
                r0 = 0
                return r0
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public java.lang.String asUrl() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class UrlConvertor extends com.umeng.socialize.media.UMImage.ConfiguredConvertor {
        final /* synthetic */ com.umeng.socialize.media.UMImage a;
        private java.lang.String b;

        public UrlConvertor(com.umeng.socialize.media.UMImage r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.b = r2
                return
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public byte[] asBinary() {
                r1 = this;
                java.lang.String r0 = r1.b
                byte[] r0 = com.umeng.socialize.c.a.a.a(r0)
                return r0
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public android.graphics.Bitmap asBitmap() {
                r1 = this;
                byte[] r0 = r1.asBinary()
                boolean r0 = com.umeng.socialize.utils.SocializeUtils.assertBinaryInvalid(r0)
                if (r0 == 0) goto L13
                byte[] r0 = r1.asBinary()
                android.graphics.Bitmap r0 = com.umeng.socialize.c.a.a.a(r0)
                return r0
            L13:
                r0 = 0
                return r0
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public java.io.File asFile() {
                r1 = this;
                byte[] r0 = r1.asBinary()
                boolean r0 = com.umeng.socialize.utils.SocializeUtils.assertBinaryInvalid(r0)
                if (r0 == 0) goto L13
                byte[] r0 = r1.asBinary()
                java.io.File r0 = com.umeng.socialize.c.a.a.b(r0)
                return r0
            L13:
                r0 = 0
                return r0
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public java.lang.String asUrl() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }
    }

    static {
            return
    }

    public UMImage(android.content.Context r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            r0 = 1
            r1.isLoadImgByCompress = r0
            com.umeng.socialize.media.UMImage$CompressStyle r0 = com.umeng.socialize.media.UMImage.CompressStyle.SCALE
            r1.compressStyle = r0
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            r1.compressFormat = r0
            r0 = 0
            r1.i = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.a(r2, r3)
            return
    }

    public UMImage(android.content.Context r2, int r3, com.umeng.social.tool.UMImageMark r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            r0 = 1
            r1.isLoadImgByCompress = r0
            com.umeng.socialize.media.UMImage$CompressStyle r0 = com.umeng.socialize.media.UMImage.CompressStyle.SCALE
            r1.compressStyle = r0
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            r1.compressFormat = r0
            r0 = 0
            r1.i = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.a(r2, r3, r4)
            return
    }

    public UMImage(android.content.Context r2, android.graphics.Bitmap r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            r0 = 1
            r1.isLoadImgByCompress = r0
            com.umeng.socialize.media.UMImage$CompressStyle r0 = com.umeng.socialize.media.UMImage.CompressStyle.SCALE
            r1.compressStyle = r0
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            r1.compressFormat = r0
            r0 = 0
            r1.i = r0
            r1.a(r2, r3)
            return
    }

    public UMImage(android.content.Context r2, android.graphics.Bitmap r3, com.umeng.social.tool.UMImageMark r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            r0 = 1
            r1.isLoadImgByCompress = r0
            com.umeng.socialize.media.UMImage$CompressStyle r0 = com.umeng.socialize.media.UMImage.CompressStyle.SCALE
            r1.compressStyle = r0
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            r1.compressFormat = r0
            r0 = 0
            r1.i = r0
            r1.a(r2, r3, r4)
            return
    }

    public UMImage(android.content.Context r2, java.io.File r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            r0 = 1
            r1.isLoadImgByCompress = r0
            com.umeng.socialize.media.UMImage$CompressStyle r0 = com.umeng.socialize.media.UMImage.CompressStyle.SCALE
            r1.compressStyle = r0
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            r1.compressFormat = r0
            r0 = 0
            r1.i = r0
            r1.a(r2, r3)
            return
    }

    public UMImage(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r1.<init>(r3)
            r0 = 0
            r1.f = r0
            r0 = 1
            r1.isLoadImgByCompress = r0
            com.umeng.socialize.media.UMImage$CompressStyle r0 = com.umeng.socialize.media.UMImage.CompressStyle.SCALE
            r1.compressStyle = r0
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            r1.compressFormat = r0
            r0 = 0
            r1.i = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            java.lang.Object r2 = r0.get()
            android.content.Context r2 = (android.content.Context) r2
            r1.a(r2, r3)
            return
    }

    public UMImage(android.content.Context r2, byte[] r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            r0 = 1
            r1.isLoadImgByCompress = r0
            com.umeng.socialize.media.UMImage$CompressStyle r0 = com.umeng.socialize.media.UMImage.CompressStyle.SCALE
            r1.compressStyle = r0
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            r1.compressFormat = r0
            r0 = 0
            r1.i = r0
            r1.a(r2, r3)
            return
    }

    public UMImage(android.content.Context r2, byte[] r3, com.umeng.social.tool.UMImageMark r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            r0 = 1
            r1.isLoadImgByCompress = r0
            com.umeng.socialize.media.UMImage$CompressStyle r0 = com.umeng.socialize.media.UMImage.CompressStyle.SCALE
            r1.compressStyle = r0
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            r1.compressFormat = r0
            r0 = 0
            r1.i = r0
            r1.a(r2, r3, r4)
            return
    }

    private float a(float r2, float r3, float r4, float r5) {
            r1 = this;
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto Lb
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Lb
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r2
        Lb:
            float r2 = r2 / r4
            float r3 = r3 / r5
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L12
            return r2
        L12:
            return r3
    }

    private android.graphics.Bitmap a(android.content.Context r8, int r9) {
            r7 = this;
            r0 = 0
            if (r9 == 0) goto L61
            if (r8 == 0) goto L61
            com.umeng.social.tool.UMImageMark r1 = r7.h
            if (r1 != 0) goto La
            goto L61
        La:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r1.<init>()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r2 = 1
            r1.inJustDecodeBounds = r2     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            android.content.res.Resources r2 = r8.getResources()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            java.io.InputStream r2 = r2.openRawResource(r9)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            android.graphics.BitmapFactory.decodeStream(r2, r0, r1)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            r7.a(r2)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            int r3 = r1.outWidth     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            int r4 = r1.outHeight     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            int r5 = com.umeng.socialize.media.UMImage.MAX_WIDTH     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            int r6 = com.umeng.socialize.media.UMImage.MAX_HEIGHT     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            float r3 = r7.a(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            if (r3 <= 0) goto L3b
            r1.inSampleSize = r3     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            goto L3b
        L36:
            r8 = move-exception
            r0 = r2
            goto L5d
        L39:
            r8 = move-exception
            goto L56
        L3b:
            r3 = 0
            r1.inJustDecodeBounds = r3     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            android.content.res.Resources r8 = r8.getResources()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            java.io.InputStream r2 = r8.openRawResource(r9)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r2, r0, r1)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            android.graphics.Bitmap r8 = r7.a(r8, r3)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            r7.a(r2)
            return r8
        L52:
            r8 = move-exception
            goto L5d
        L54:
            r8 = move-exception
            r2 = r0
        L56:
            com.umeng.socialize.utils.SLog.error(r8)     // Catch: java.lang.Throwable -> L36
            r7.a(r2)
            return r0
        L5d:
            r7.a(r0)
            throw r8
        L61:
            return r0
    }

    private android.graphics.Bitmap a(android.graphics.Bitmap r8) {
            r7 = this;
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            float r0 = (float) r3
            float r1 = (float) r4
            int r2 = com.umeng.socialize.media.UMImage.MAX_WIDTH
            float r2 = (float) r2
            int r5 = com.umeng.socialize.media.UMImage.MAX_HEIGHT
            float r5 = (float) r5
            float r0 = r7.a(r0, r1, r2, r5)
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L1a
            return r8
        L1a:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r0
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r5.postScale(r1, r1)
            r2 = 0
            r6 = 0
            r1 = 0
            r0 = r8
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            r7.b(r0)
            return r8
    }

    private android.graphics.Bitmap a(android.graphics.Bitmap r2, boolean r3) {
            r1 = this;
            com.umeng.social.tool.UMImageMark r0 = r1.h
            if (r0 != 0) goto L5
            return r2
        L5:
            r0 = 0
            if (r2 != 0) goto L9
            return r0
        L9:
            if (r3 == 0) goto L12
            android.graphics.Bitmap r2 = r1.a(r2)     // Catch: java.lang.Exception -> L10
            goto L12
        L10:
            r2 = move-exception
            goto L19
        L12:
            com.umeng.social.tool.UMImageMark r3 = r1.h     // Catch: java.lang.Exception -> L10
            android.graphics.Bitmap r2 = r3.compound(r2)     // Catch: java.lang.Exception -> L10
            return r2
        L19:
            com.umeng.socialize.utils.SLog.error(r2)
            return r0
    }

    private android.graphics.Bitmap a(byte[] r8) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L3c
            com.umeng.social.tool.UMImageMark r1 = r7.h
            if (r1 != 0) goto L8
            goto L3c
        L8:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> L2b
            r1.<init>()     // Catch: java.lang.Exception -> L2b
            r2 = 1
            r1.inJustDecodeBounds = r2     // Catch: java.lang.Exception -> L2b
            int r2 = r8.length     // Catch: java.lang.Exception -> L2b
            r3 = 0
            android.graphics.BitmapFactory.decodeByteArray(r8, r3, r2, r1)     // Catch: java.lang.Exception -> L2b
            int r2 = r1.outWidth     // Catch: java.lang.Exception -> L2b
            float r2 = (float) r2     // Catch: java.lang.Exception -> L2b
            int r4 = r1.outHeight     // Catch: java.lang.Exception -> L2b
            float r4 = (float) r4     // Catch: java.lang.Exception -> L2b
            int r5 = com.umeng.socialize.media.UMImage.MAX_WIDTH     // Catch: java.lang.Exception -> L2b
            float r5 = (float) r5     // Catch: java.lang.Exception -> L2b
            int r6 = com.umeng.socialize.media.UMImage.MAX_HEIGHT     // Catch: java.lang.Exception -> L2b
            float r6 = (float) r6     // Catch: java.lang.Exception -> L2b
            float r2 = r7.a(r2, r4, r5, r6)     // Catch: java.lang.Exception -> L2b
            int r2 = (int) r2     // Catch: java.lang.Exception -> L2b
            if (r2 <= 0) goto L2d
            r1.inSampleSize = r2     // Catch: java.lang.Exception -> L2b
            goto L2d
        L2b:
            r8 = move-exception
            goto L39
        L2d:
            r1.inJustDecodeBounds = r3     // Catch: java.lang.Exception -> L2b
            int r2 = r8.length     // Catch: java.lang.Exception -> L2b
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r8, r3, r2, r1)     // Catch: java.lang.Exception -> L2b
            android.graphics.Bitmap r8 = r7.a(r8, r3)     // Catch: java.lang.Exception -> L2b
            return r8
        L39:
            com.umeng.socialize.utils.SLog.error(r8)
        L3c:
            return r0
    }

    private void a(android.content.Context r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            r1.a(r2, r3, r0)
            return
    }

    private void a(android.content.Context r3, java.lang.Object r4, com.umeng.social.tool.UMImageMark r5) {
            r2 = this;
            r0 = 1
            if (r5 == 0) goto La
            r2.j = r0
            r2.h = r5
            r5.setContext(r3)
        La:
            android.content.Context r5 = com.umeng.socialize.utils.ContextUtil.getContext()
            if (r5 != 0) goto L1b
            android.content.Context r5 = r3.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            com.umeng.socialize.utils.ContextUtil.setContext(r5)
        L1b:
            boolean r5 = r4 instanceof java.io.File
            if (r5 == 0) goto L2d
            int r3 = com.umeng.socialize.media.UMImage.FILE_IMAGE
            r2.i = r3
            com.umeng.socialize.media.UMImage$FileConvertor r3 = new com.umeng.socialize.media.UMImage$FileConvertor
            java.io.File r4 = (java.io.File) r4
            r3.<init>(r2, r4)
            r2.f = r3
            return
        L2d:
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L3f
            int r3 = com.umeng.socialize.media.UMImage.URL_IMAGE
            r2.i = r3
            com.umeng.socialize.media.UMImage$UrlConvertor r3 = new com.umeng.socialize.media.UMImage$UrlConvertor
            java.lang.String r4 = (java.lang.String) r4
            r3.<init>(r2, r4)
            r2.f = r3
            return
        L3f:
            boolean r5 = r4 instanceof java.lang.Integer
            r1 = 0
            if (r5 == 0) goto L79
            int r5 = com.umeng.socialize.media.UMImage.RES_IMAGE
            r2.i = r5
            boolean r5 = r2.isHasWaterMark()
            if (r5 == 0) goto L59
            r5 = r4
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            android.graphics.Bitmap r1 = r2.a(r3, r5)
        L59:
            if (r1 == 0) goto L63
            com.umeng.socialize.media.UMImage$BitmapConvertor r3 = new com.umeng.socialize.media.UMImage$BitmapConvertor
            r3.<init>(r2, r1)
            r2.f = r3
            return
        L63:
            com.umeng.socialize.media.UMImage$ResConvertor r5 = new com.umeng.socialize.media.UMImage$ResConvertor
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.<init>(r2, r3, r4)
            r2.f = r5
            return
        L79:
            boolean r3 = r4 instanceof byte[]
            if (r3 == 0) goto La2
            int r3 = com.umeng.socialize.media.UMImage.BINARY_IMAGE
            r2.i = r3
            boolean r3 = r2.isHasWaterMark()
            if (r3 == 0) goto L8e
            r3 = r4
            byte[] r3 = (byte[]) r3
            android.graphics.Bitmap r1 = r2.a(r3)
        L8e:
            if (r1 == 0) goto L98
            com.umeng.socialize.media.UMImage$BitmapConvertor r3 = new com.umeng.socialize.media.UMImage$BitmapConvertor
            r3.<init>(r2, r1)
            r2.f = r3
            return
        L98:
            com.umeng.socialize.media.UMImage$BinaryConvertor r3 = new com.umeng.socialize.media.UMImage$BinaryConvertor
            byte[] r4 = (byte[]) r4
            r3.<init>(r2, r4)
            r2.f = r3
            return
        La2:
            boolean r3 = r4 instanceof android.graphics.Bitmap
            if (r3 == 0) goto Lc4
            int r3 = com.umeng.socialize.media.UMImage.BITMAP_IMAGE
            r2.i = r3
            boolean r3 = r2.isHasWaterMark()
            if (r3 == 0) goto Lb7
            r3 = r4
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            android.graphics.Bitmap r1 = r2.a(r3, r0)
        Lb7:
            if (r1 != 0) goto Lbc
            r1 = r4
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
        Lbc:
            com.umeng.socialize.media.UMImage$BitmapConvertor r3 = new com.umeng.socialize.media.UMImage$BitmapConvertor
            r3.<init>(r2, r1)
            r2.f = r3
            return
        Lc4:
            if (r4 == 0) goto Le3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = com.umeng.socialize.utils.UmengText.IMAGE.UNKNOW_UMIMAGE
            r3.append(r5)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.umeng.socialize.utils.SLog.E(r3)
            return
        Le3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.IMAGE.UNKNOW_UMIMAGE
            r3.append(r4)
            java.lang.String r4 = "null"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.umeng.socialize.utils.SLog.E(r3)
            return
    }

    private void a(java.io.Closeable r1) {
            r0 = this;
            if (r1 == 0) goto La
            r1.close()     // Catch: java.lang.Exception -> L6
            return
        L6:
            r1 = move-exception
            com.umeng.socialize.utils.SLog.error(r1)
        La:
            return
    }

    private void b(android.graphics.Bitmap r2) {
            r1 = this;
            if (r2 == 0) goto L10
            boolean r0 = r2.isRecycled()     // Catch: java.lang.Exception -> Lc
            if (r0 != 0) goto L10
            r2.recycle()     // Catch: java.lang.Exception -> Lc
            return
        Lc:
            r2 = move-exception
            com.umeng.socialize.utils.SLog.error(r2)
        L10:
            return
    }

    public byte[] asBinImage() {
            r1 = this;
            com.umeng.socialize.media.UMImage$ConfiguredConvertor r0 = r1.f
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            byte[] r0 = r0.asBinary()
            return r0
    }

    public android.graphics.Bitmap asBitmap() {
            r1 = this;
            com.umeng.socialize.media.UMImage$ConfiguredConvertor r0 = r1.f
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.graphics.Bitmap r0 = r0.asBitmap()
            return r0
    }

    public java.io.File asFileImage() {
            r1 = this;
            com.umeng.socialize.media.UMImage$ConfiguredConvertor r0 = r1.f
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.io.File r0 = r0.asFile()
            return r0
    }

    public java.lang.String asUrlImage() {
            r1 = this;
            com.umeng.socialize.media.UMImage$ConfiguredConvertor r0 = r1.f
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.asUrl()
            return r0
    }

    public int getImageStyle() {
            r1 = this;
            int r0 = r1.i
            return r0
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public com.umeng.socialize.media.UMediaObject.MediaType getMediaType() {
            r1 = this;
            com.umeng.socialize.media.UMediaObject$MediaType r0 = com.umeng.socialize.media.UMediaObject.MediaType.IMAGE
            return r0
    }

    @Override // com.umeng.socialize.media.BaseMediaObject
    public com.umeng.socialize.media.UMImage getThumbImage() {
            r1 = this;
            com.umeng.socialize.media.UMImage r0 = r1.g
            return r0
    }

    public boolean isHasWaterMark() {
            r1 = this;
            boolean r0 = r1.j
            return r0
    }

    @Override // com.umeng.socialize.media.BaseMediaObject
    public void setThumb(com.umeng.socialize.media.UMImage r1) {
            r0 = this;
            r0.g = r1
            return
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public byte[] toByte() {
            r1 = this;
            byte[] r0 = r1.asBinImage()
            return r0
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public final java.util.Map<java.lang.String, java.lang.Object> toUrlExtraParams() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = r3.isUrlMedia()
            if (r1 == 0) goto L1b
            java.lang.String r1 = com.umeng.socialize.net.utils.SocializeProtocolConstants.PROTOCOL_KEY_FURL
            java.lang.String r2 = r3.a
            r0.put(r1, r2)
            java.lang.String r1 = com.umeng.socialize.net.utils.SocializeProtocolConstants.PROTOCOL_KEY_FTYPE
            com.umeng.socialize.media.UMediaObject$MediaType r2 = r3.getMediaType()
            r0.put(r1, r2)
        L1b:
            return r0
    }
}
