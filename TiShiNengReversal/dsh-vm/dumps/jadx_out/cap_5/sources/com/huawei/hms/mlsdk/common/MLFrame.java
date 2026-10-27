package com.huawei.hms.mlsdk.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class MLFrame {
    public static final int SCREEN_FIRST_QUADRANT = 0;
    public static final int SCREEN_FOURTH_QUADRANT = 3;
    public static final int SCREEN_SECOND_QUADRANT = 1;
    public static final int SCREEN_THIRD_QUADRANT = 2;
    private android.graphics.Bitmap bitmap;
    private java.nio.ByteBuffer byteBuffer;
    private byte[] bytes;
    private volatile java.lang.Boolean frameInit;
    private com.huawei.hms.mlsdk.common.MLFrame.Property property;
    private int recMode;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.hms.mlsdk.common.MLFrame$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Creator {
        private com.huawei.hms.mlsdk.common.MLFrame frame;

        public Creator() {
                r1 = this;
                r1.<init>()
                com.huawei.hms.mlsdk.common.MLFrame r0 = new com.huawei.hms.mlsdk.common.MLFrame
                r0.<init>()
                r1.frame = r0
                return
        }

        public com.huawei.hms.mlsdk.common.MLFrame create() {
                r2 = this;
                com.huawei.hms.mlsdk.common.MLFrame r0 = r2.frame
                java.nio.ByteBuffer r0 = com.huawei.hms.mlsdk.common.MLFrame.access$500(r0)
                if (r0 != 0) goto L19
                com.huawei.hms.mlsdk.common.MLFrame r0 = r2.frame
                android.graphics.Bitmap r0 = com.huawei.hms.mlsdk.common.MLFrame.access$400(r0)
                if (r0 == 0) goto L11
                goto L19
            L11:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Failed to create image instance, both bitmap and byteBuffer data are not specified."
                r0.<init>(r1)
                throw r0
            L19:
                com.huawei.hms.mlsdk.common.MLFrame r0 = r2.frame
                return r0
        }

        public com.huawei.hms.mlsdk.common.MLFrame.Creator setBitmap(android.graphics.Bitmap r4) {
                r3 = this;
                int r0 = r4.getWidth()
                int r1 = r4.getHeight()
                com.huawei.hms.mlsdk.common.MLFrame r2 = r3.frame
                com.huawei.hms.mlsdk.common.MLFrame.access$402(r2, r4)
                com.huawei.hms.mlsdk.common.MLFrame r4 = r3.frame
                com.huawei.hms.mlsdk.common.MLFrame$Property r4 = r4.acquireProperty()
                com.huawei.hms.mlsdk.common.MLFrame.Property.access$002(r4, r0)
                com.huawei.hms.mlsdk.common.MLFrame.Property.access$102(r4, r1)
                return r3
        }

        public com.huawei.hms.mlsdk.common.MLFrame.Creator setFramePropertyExt(com.huawei.hms.mlsdk.common.MLFrame.Property.Ext r2) {
                r1 = this;
                com.huawei.hms.mlsdk.common.MLFrame r0 = r1.frame
                com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r0.acquireProperty()
                com.huawei.hms.mlsdk.common.MLFrame.Property.access$1002(r0, r2)
                return r1
        }

        public com.huawei.hms.mlsdk.common.MLFrame.Creator setItemIdentity(int r2) {
                r1 = this;
                com.huawei.hms.mlsdk.common.MLFrame r0 = r1.frame
                com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r0.acquireProperty()
                com.huawei.hms.mlsdk.common.MLFrame.Property.access$702(r0, r2)
                return r1
        }

        public com.huawei.hms.mlsdk.common.MLFrame.Creator setQuadrant(int r2) {
                r1 = this;
                com.huawei.hms.mlsdk.common.MLFrame r0 = r1.frame
                com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r0.acquireProperty()
                com.huawei.hms.mlsdk.common.MLFrame.Property.access$902(r0, r2)
                return r1
        }

        public com.huawei.hms.mlsdk.common.MLFrame.Creator setTimestamp(long r2) {
                r1 = this;
                com.huawei.hms.mlsdk.common.MLFrame r0 = r1.frame
                com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r0.acquireProperty()
                com.huawei.hms.mlsdk.common.MLFrame.Property.access$802(r0, r2)
                return r1
        }

        public com.huawei.hms.mlsdk.common.MLFrame.Creator writeByteBufferData(java.nio.ByteBuffer r3, int r4, int r5, int r6) {
                r2 = this;
                if (r3 == 0) goto L53
                int r0 = r3.capacity()
                int r1 = r4 * r5
                if (r0 < r1) goto L4b
                r0 = 17
                if (r6 == r0) goto L34
                r0 = 16
                if (r6 == r0) goto L34
                r0 = 842094169(0x32315659, float:1.0322389E-8)
                if (r6 != r0) goto L18
                goto L34
            L18:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Parameter formatType:"
                r4.append(r5)
                r4.append(r6)
                java.lang.String r5 = " is not supported"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L34:
                com.huawei.hms.mlsdk.common.MLFrame r0 = r2.frame
                com.huawei.hms.mlsdk.common.MLFrame.access$502(r0, r3)
                com.huawei.hms.mlsdk.common.MLFrame r3 = r2.frame
                com.huawei.hms.mlsdk.common.MLFrame$Property r3 = r3.acquireProperty()
                if (r3 == 0) goto L4a
                com.huawei.hms.mlsdk.common.MLFrame.Property.access$602(r3, r6)
                com.huawei.hms.mlsdk.common.MLFrame.Property.access$002(r3, r4)
                com.huawei.hms.mlsdk.common.MLFrame.Property.access$102(r3, r5)
            L4a:
                return r2
            L4b:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Not enough capacity for image data size."
                r3.<init>(r4)
                throw r3
            L53:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Parameter： data is not specified"
                r3.<init>(r4)
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Property {
        public static final int IMAGE_FORMAT_NV21 = 17;
        public static final int IMAGE_FORMAT_YV12 = 842094169;
        public static final int SCREEN_FIRST_QUADRANT = 0;
        public static final int SCREEN_FOURTH_QUADRANT = 3;
        public static final int SCREEN_SECOND_QUADRANT = 1;
        public static final int SCREEN_THIRD_QUADRANT = 2;
        private com.huawei.hms.mlsdk.common.MLFrame.Property.Ext ext;
        private int formatType;
        private int height;
        private int itemIdentity;
        private int quadrant;
        private long timestamp;
        private int width;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class Creator {
            private com.huawei.hms.mlsdk.common.MLFrame.Property.Ext ext;
            private int formatType;
            private int height;
            private int itemIdentity;
            private int quadrant;
            private long timestamp;
            private int width;

            public Creator() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public com.huawei.hms.mlsdk.common.MLFrame.Property create() {
                    r10 = this;
                    com.huawei.hms.mlsdk.common.MLFrame$Property r0 = new com.huawei.hms.mlsdk.common.MLFrame$Property
                    int r1 = r10.width
                    int r2 = r10.height
                    int r3 = r10.quadrant
                    int r4 = r10.formatType
                    int r5 = r10.itemIdentity
                    long r6 = r10.timestamp
                    com.huawei.hms.mlsdk.common.MLFrame$Property$Ext r8 = r10.ext
                    r9 = 0
                    r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
                    return r0
            }

            public com.huawei.hms.mlsdk.common.MLFrame.Property.Creator setExt(com.huawei.hms.mlsdk.common.MLFrame.Property.Ext r1) {
                    r0 = this;
                    r0.ext = r1
                    return r0
            }

            public com.huawei.hms.mlsdk.common.MLFrame.Property.Creator setFormatType(int r1) {
                    r0 = this;
                    r0.formatType = r1
                    return r0
            }

            public com.huawei.hms.mlsdk.common.MLFrame.Property.Creator setHeight(int r1) {
                    r0 = this;
                    r0.height = r1
                    return r0
            }

            public com.huawei.hms.mlsdk.common.MLFrame.Property.Creator setItemIdentity(int r1) {
                    r0 = this;
                    r0.itemIdentity = r1
                    return r0
            }

            public com.huawei.hms.mlsdk.common.MLFrame.Property.Creator setQuadrant(int r1) {
                    r0 = this;
                    r0.quadrant = r1
                    return r0
            }

            public com.huawei.hms.mlsdk.common.MLFrame.Property.Creator setTimestamp(int r3) {
                    r2 = this;
                    long r0 = (long) r3
                    r2.timestamp = r0
                    return r2
            }

            public com.huawei.hms.mlsdk.common.MLFrame.Property.Creator setWidth(int r1) {
                    r0 = this;
                    r0.width = r1
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class Ext {
            private int lensId;
            private int maxZoom;
            private android.graphics.Rect rect;
            private int zoom;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            public static class Creator {
                private int lensId;
                private int maxZoom;
                private android.graphics.Rect rect;
                private int zoom;

                public Creator() {
                        r1 = this;
                        r1.<init>()
                        r0 = 0
                        r1.lensId = r0
                        r1.zoom = r0
                        return
                }

                public com.huawei.hms.mlsdk.common.MLFrame.Property.Ext build() {
                        r6 = this;
                        com.huawei.hms.mlsdk.common.MLFrame$Property$Ext r0 = new com.huawei.hms.mlsdk.common.MLFrame$Property$Ext
                        int r1 = r6.lensId
                        int r2 = r6.zoom
                        int r3 = r6.maxZoom
                        android.graphics.Rect r4 = r6.rect
                        r5 = 0
                        r0.<init>(r1, r2, r3, r4, r5)
                        return r0
                }

                public com.huawei.hms.mlsdk.common.MLFrame.Property.Ext.Creator setLensId(int r1) {
                        r0 = this;
                        r0.lensId = r1
                        return r0
                }

                public com.huawei.hms.mlsdk.common.MLFrame.Property.Ext.Creator setMaxZoom(int r1) {
                        r0 = this;
                        r0.maxZoom = r1
                        return r0
                }

                public com.huawei.hms.mlsdk.common.MLFrame.Property.Ext.Creator setRect(android.graphics.Rect r1) {
                        r0 = this;
                        r0.rect = r1
                        return r0
                }

                public com.huawei.hms.mlsdk.common.MLFrame.Property.Ext.Creator setZoom(int r1) {
                        r0 = this;
                        r0.zoom = r1
                        return r0
                }
            }

            private Ext(int r1, int r2, int r3, android.graphics.Rect r4) {
                    r0 = this;
                    r0.<init>()
                    r0.lensId = r1
                    r0.zoom = r2
                    r0.maxZoom = r3
                    r0.rect = r4
                    return
            }

            /* synthetic */ Ext(int r1, int r2, int r3, android.graphics.Rect r4, com.huawei.hms.mlsdk.common.MLFrame.AnonymousClass1 r5) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4)
                    return
            }

            public int getLensId() {
                    r1 = this;
                    int r0 = r1.lensId
                    return r0
            }

            public int getMaxZoom() {
                    r1 = this;
                    int r0 = r1.maxZoom
                    return r0
            }

            public android.graphics.Rect getRect() {
                    r1 = this;
                    android.graphics.Rect r0 = r1.rect
                    return r0
            }

            public int getZoom() {
                    r1 = this;
                    int r0 = r1.zoom
                    return r0
            }
        }

        public Property() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.quadrant = r0
                r0 = -1
                r1.formatType = r0
                r1.itemIdentity = r0
                com.huawei.hms.mlsdk.common.MLFrame$Property$Ext$Creator r0 = new com.huawei.hms.mlsdk.common.MLFrame$Property$Ext$Creator
                r0.<init>()
                com.huawei.hms.mlsdk.common.MLFrame$Property$Ext r0 = r0.build()
                r1.ext = r0
                return
        }

        private Property(int r1, int r2, int r3, int r4, int r5, long r6, com.huawei.hms.mlsdk.common.MLFrame.Property.Ext r8) {
                r0 = this;
                r0.<init>()
                r0.width = r1
                r0.height = r2
                r0.quadrant = r3
                r0.formatType = r4
                r0.itemIdentity = r5
                r0.timestamp = r6
                r0.ext = r8
                return
        }

        /* synthetic */ Property(int r1, int r2, int r3, int r4, int r5, long r6, com.huawei.hms.mlsdk.common.MLFrame.Property.Ext r8, com.huawei.hms.mlsdk.common.MLFrame.AnonymousClass1 r9) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r8)
                return
        }

        public Property(com.huawei.hms.mlsdk.common.MLFrame.Property r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.quadrant = r0
                r0 = -1
                r2.formatType = r0
                r2.itemIdentity = r0
                int r0 = r3.getWidth()
                r2.width = r0
                int r0 = r3.getHeight()
                r2.height = r0
                int r0 = r3.getFormatType()
                r2.formatType = r0
                int r0 = r3.getQuadrant()
                r2.quadrant = r0
                int r0 = r3.getItemIdentity()
                r2.itemIdentity = r0
                long r0 = r3.getTimestamp()
                r2.timestamp = r0
                com.huawei.hms.mlsdk.common.MLFrame$Property$Ext r3 = r3.getExt()
                r2.ext = r3
                return
        }

        static /* synthetic */ int access$000(com.huawei.hms.mlsdk.common.MLFrame.Property r0) {
                int r0 = r0.width
                return r0
        }

        static /* synthetic */ int access$002(com.huawei.hms.mlsdk.common.MLFrame.Property r0, int r1) {
                r0.width = r1
                return r1
        }

        static /* synthetic */ int access$100(com.huawei.hms.mlsdk.common.MLFrame.Property r0) {
                int r0 = r0.height
                return r0
        }

        static /* synthetic */ com.huawei.hms.mlsdk.common.MLFrame.Property.Ext access$1002(com.huawei.hms.mlsdk.common.MLFrame.Property r0, com.huawei.hms.mlsdk.common.MLFrame.Property.Ext r1) {
                r0.ext = r1
                return r1
        }

        static /* synthetic */ int access$102(com.huawei.hms.mlsdk.common.MLFrame.Property r0, int r1) {
                r0.height = r1
                return r1
        }

        static /* synthetic */ int access$602(com.huawei.hms.mlsdk.common.MLFrame.Property r0, int r1) {
                r0.formatType = r1
                return r1
        }

        static /* synthetic */ int access$702(com.huawei.hms.mlsdk.common.MLFrame.Property r0, int r1) {
                r0.itemIdentity = r1
                return r1
        }

        static /* synthetic */ long access$802(com.huawei.hms.mlsdk.common.MLFrame.Property r0, long r1) {
                r0.timestamp = r1
                return r1
        }

        static /* synthetic */ int access$902(com.huawei.hms.mlsdk.common.MLFrame.Property r0, int r1) {
                r0.quadrant = r1
                return r1
        }

        public com.huawei.hms.mlsdk.common.MLFrame.Property.Ext getExt() {
                r1 = this;
                com.huawei.hms.mlsdk.common.MLFrame$Property$Ext r0 = r1.ext
                return r0
        }

        public int getFormatType() {
                r1 = this;
                int r0 = r1.formatType
                return r0
        }

        public int getHeight() {
                r1 = this;
                int r0 = r1.height
                return r0
        }

        public int getItemIdentity() {
                r1 = this;
                int r0 = r1.itemIdentity
                return r0
        }

        public int getQuadrant() {
                r1 = this;
                int r0 = r1.quadrant
                return r0
        }

        public long getTimestamp() {
                r2 = this;
                long r0 = r2.timestamp
                return r0
        }

        public int getWidth() {
                r1 = this;
                int r0 = r1.width
                return r0
        }

        public void resetWidthAndHeight() {
                r2 = this;
                int r0 = r2.quadrant
                int r0 = r0 % 2
                if (r0 == 0) goto Le
                int r0 = r2.width
                int r1 = r2.height
                r2.width = r1
                r2.height = r0
            Le:
                r0 = 0
                r2.quadrant = r0
                return
        }
    }

    public MLFrame() {
            r1 = this;
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.frameInit = r0
            com.huawei.hms.mlsdk.common.MLFrame$Property r0 = new com.huawei.hms.mlsdk.common.MLFrame$Property
            r0.<init>()
            r1.property = r0
            r0 = 0
            r1.byteBuffer = r0
            r1.bitmap = r0
            return
    }

    private MLFrame(android.graphics.Bitmap r2) {
            r1 = this;
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.frameInit = r0
            r1.bitmap = r2
            return
    }

    private MLFrame(android.graphics.Bitmap r2, com.huawei.hms.mlsdk.common.MLFrame.Property r3) {
            r1 = this;
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.frameInit = r0
            r1.bitmap = r2
            if (r3 == 0) goto Lc
            goto L11
        Lc:
            com.huawei.hms.mlsdk.common.MLFrame$Property r3 = new com.huawei.hms.mlsdk.common.MLFrame$Property
            r3.<init>()
        L11:
            r1.property = r3
            return
    }

    private MLFrame(java.nio.ByteBuffer r2, com.huawei.hms.mlsdk.common.MLFrame.Property r3) {
            r1 = this;
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.frameInit = r0
            r1.byteBuffer = r2
            if (r3 == 0) goto Lc
            goto L11
        Lc:
            com.huawei.hms.mlsdk.common.MLFrame$Property r3 = new com.huawei.hms.mlsdk.common.MLFrame$Property
            r3.<init>()
        L11:
            r1.property = r3
            return
    }

    private MLFrame(byte[] r2) {
            r1 = this;
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.frameInit = r0
            r1.bytes = r2
            return
    }

    private MLFrame(byte[] r1, com.huawei.hms.mlsdk.common.MLFrame.Property r2) {
            r0 = this;
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ android.graphics.Bitmap access$400(com.huawei.hms.mlsdk.common.MLFrame r0) {
            android.graphics.Bitmap r0 = r0.bitmap
            return r0
    }

    static /* synthetic */ android.graphics.Bitmap access$402(com.huawei.hms.mlsdk.common.MLFrame r0, android.graphics.Bitmap r1) {
            r0.bitmap = r1
            return r1
    }

    static /* synthetic */ java.nio.ByteBuffer access$500(com.huawei.hms.mlsdk.common.MLFrame r0) {
            java.nio.ByteBuffer r0 = r0.byteBuffer
            return r0
    }

    static /* synthetic */ java.nio.ByteBuffer access$502(com.huawei.hms.mlsdk.common.MLFrame r0, java.nio.ByteBuffer r1) {
            r0.byteBuffer = r1
            return r1
    }

    public static com.huawei.hms.mlsdk.common.MLFrame fromBitmap(android.graphics.Bitmap r1) {
            com.huawei.hms.mlsdk.common.MLFrame r0 = new com.huawei.hms.mlsdk.common.MLFrame
            r0.<init>(r1)
            return r0
    }

    public static com.huawei.hms.mlsdk.common.MLFrame fromByteArray(byte[] r1, com.huawei.hms.mlsdk.common.MLFrame.Property r2) {
            com.huawei.hms.mlsdk.common.MLFrame r0 = new com.huawei.hms.mlsdk.common.MLFrame
            r0.<init>(r1, r2)
            return r0
    }

    public static com.huawei.hms.mlsdk.common.MLFrame fromByteBuffer(java.nio.ByteBuffer r1, com.huawei.hms.mlsdk.common.MLFrame.Property r2) {
            com.huawei.hms.mlsdk.common.MLFrame r0 = new com.huawei.hms.mlsdk.common.MLFrame
            r0.<init>(r1, r2)
            return r0
    }

    public static com.huawei.hms.mlsdk.common.MLFrame fromFilePath(android.content.Context r0, android.net.Uri r1) throws java.io.IOException {
            if (r0 == 0) goto L24
            if (r1 == 0) goto L1c
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Media.getBitmap(r0, r1)
            if (r0 == 0) goto L14
            com.huawei.hms.mlsdk.common.MLFrame r1 = new com.huawei.hms.mlsdk.common.MLFrame
            r1.<init>(r0)
            return r1
        L14:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Failed to load bitmap from uri"
            r0.<init>(r1)
            throw r0
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Parameter uri is mandatory"
            r0.<init>(r1)
            throw r0
        L24:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Parameter context is mandatory"
            r0.<init>(r1)
            throw r0
    }

    @android.annotation.TargetApi(19)
    public static com.huawei.hms.mlsdk.common.MLFrame fromMediaImage(android.media.Image r3, int r4) {
            int r0 = r3.getFormat()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 == r1) goto L2d
            r2 = 35
            if (r0 != r2) goto Ld
            goto L2d
        Ld:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported format: "
            r0.append(r1)
            int r3 = r3.getFormat()
            r0.append(r3)
            java.lang.String r3 = ", Only JPEG and YUV_420_888 are supported"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L2d:
            if (r0 != r1) goto L6b
            android.media.Image$Plane[] r3 = r3.getPlanes()
            if (r3 == 0) goto L69
            int r0 = r3.length
            r1 = 1
            if (r0 != r1) goto L69
            r0 = 0
            r1 = r3[r0]
            if (r1 == 0) goto L69
            java.nio.ByteBuffer r1 = r1.getBuffer()
            if (r1 == 0) goto L69
            r3 = r3[r0]
            java.nio.ByteBuffer r3 = r3.getBuffer()
            int r1 = r3.remaining()
            byte[] r2 = new byte[r1]
            r3.get(r2)
            if (r4 == 0) goto L63
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r2, r0, r1)
            android.graphics.Bitmap r3 = rotate(r3, r4)
            com.huawei.hms.mlsdk.common.MLFrame r4 = new com.huawei.hms.mlsdk.common.MLFrame
            r4.<init>(r3)
            goto L98
        L63:
            com.huawei.hms.mlsdk.common.MLFrame r4 = new com.huawei.hms.mlsdk.common.MLFrame
            r4.<init>(r2)
            goto L98
        L69:
            r4 = 0
            goto L98
        L6b:
            com.huawei.hms.mlsdk.common.MLFrame$Property$Creator r0 = new com.huawei.hms.mlsdk.common.MLFrame$Property$Creator
            r0.<init>()
            r1 = 17
            com.huawei.hms.mlsdk.common.MLFrame$Property$Creator r1 = r0.setFormatType(r1)
            int r2 = r3.getWidth()
            com.huawei.hms.mlsdk.common.MLFrame$Property$Creator r1 = r1.setWidth(r2)
            int r2 = r3.getHeight()
            com.huawei.hms.mlsdk.common.MLFrame$Property$Creator r1 = r1.setHeight(r2)
            r1.setQuadrant(r4)
            com.huawei.hms.mlsdk.common.MLFrame$Property r4 = r0.create()
            com.huawei.hms.mlsdk.common.MLFrame r0 = new com.huawei.hms.mlsdk.common.MLFrame
            r1 = 2
            byte[] r3 = com.huawei.hms.ml.common.utils.ImageConvertUtils.getDataFromImage(r3, r1)
            r0.<init>(r3, r4)
            r4 = r0
        L98:
            if (r4 == 0) goto L9b
            return r4
        L9b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Failed to create frame from media image."
            r3.<init>(r4)
            throw r3
    }

    private android.util.Pair<java.lang.Integer, java.lang.Integer> getPreviewSize() {
            r3 = this;
            com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r3.property
            if (r0 == 0) goto L65
            int r0 = r0.getItemIdentity()
            r1 = -1
            if (r0 == r1) goto L48
            com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r3.property
            int r0 = r0.getQuadrant()
            r1 = 1
            if (r0 == r1) goto L1f
            com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r3.property
            int r0 = r0.getQuadrant()
            r2 = 3
            if (r0 != r2) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r3.property
            if (r1 == 0) goto L28
            int r0 = r0.getHeight()
            goto L2c
        L28:
            int r0 = r0.getWidth()
        L2c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L39
            com.huawei.hms.mlsdk.common.MLFrame$Property r1 = r3.property
            int r1 = r1.getWidth()
            goto L3f
        L39:
            com.huawei.hms.mlsdk.common.MLFrame$Property r1 = r3.property
            int r1 = r1.getHeight()
        L3f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            return r0
        L48:
            android.graphics.Bitmap r0 = r3.wrapBitmap()
            int r0 = r0.getWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.graphics.Bitmap r1 = r3.wrapBitmap()
            int r1 = r1.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            return r0
        L65:
            r0 = 0
            return r0
    }

    private boolean isSupportedYuvFormat(int r2) {
            r1 = this;
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            if (r2 == r0) goto Lc
            r0 = 17
            if (r2 != r0) goto La
            goto Lc
        La:
            r2 = 0
            return r2
        Lc:
            r2 = 1
            return r2
    }

    public static android.graphics.Bitmap rotate(android.graphics.Bitmap r8, int r9) {
            if (r9 < 0) goto L24
            r0 = 3
            if (r9 > r0) goto L24
            if (r9 != 0) goto L8
            return r8
        L8:
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r9 = r9 * 90
            float r9 = (float) r9
            r6.postRotate(r9)
            int r4 = r8.getWidth()
            int r5 = r8.getHeight()
            r7 = 1
            r2 = 0
            r3 = 0
            r1 = r8
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)
            return r8
        L24:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 29
            r0.<init>(r1)
            java.lang.String r1 = "Invalid quadrant: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            throw r8
    }

    private final android.graphics.Bitmap wrapBitmap() {
            r4 = this;
            android.graphics.Bitmap r0 = r4.bitmap
            if (r0 == 0) goto L5
            return r0
        L5:
            com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r4.property
            if (r0 == 0) goto L2b
            r0 = 0
            r1 = 0
            byte[] r2 = r4.wrapJpeg(r0)     // Catch: java.lang.Throwable -> L2a
            int r3 = r2.length     // Catch: java.lang.Throwable -> L2a
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r2, r0, r3)     // Catch: java.lang.Throwable -> L2a
            com.huawei.hms.mlsdk.common.MLFrame$Property r1 = r4.property
            int r1 = r1.getQuadrant()
            if (r1 != 0) goto L1d
            goto L27
        L1d:
            com.huawei.hms.mlsdk.common.MLFrame$Property r1 = r4.property
            int r1 = r1.getQuadrant()
            android.graphics.Bitmap r0 = rotate(r0, r1)
        L27:
            r4.bitmap = r0
            goto L2b
        L2a:
            return r1
        L2b:
            android.graphics.Bitmap r0 = r4.bitmap
            return r0
    }

    public java.nio.ByteBuffer acquireGrayByteBuffer() {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.byteBuffer
            if (r0 == 0) goto L1b
            com.huawei.hms.mlsdk.common.MLFrame$Property r1 = r3.property
            if (r1 == 0) goto L1b
            byte[] r0 = r0.array()
            com.huawei.hms.mlsdk.common.MLFrame$Property r1 = r3.property
            int r1 = com.huawei.hms.mlsdk.common.MLFrame.Property.access$000(r1)
            com.huawei.hms.mlsdk.common.MLFrame$Property r2 = r3.property
            int r2 = com.huawei.hms.mlsdk.common.MLFrame.Property.access$100(r2)
            com.huawei.hms.ml.common.utils.ImageConvertUtils.nv21ToGray(r0, r1, r2)
        L1b:
            java.nio.ByteBuffer r0 = r3.byteBuffer
            return r0
    }

    public com.huawei.hms.mlsdk.common.MLFrame.Property acquireProperty() {
            r1 = this;
            com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r1.property
            return r0
    }

    public final android.util.Pair<byte[], java.lang.Float> create(int r10, int r11) {
            r9 = this;
            android.util.Pair r0 = r9.getPreviewSize()
            if (r0 != 0) goto L8
            r10 = 0
            return r10
        L8:
            android.util.Pair r0 = r9.getPreviewSize()
            java.lang.Object r0 = r0.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r4 = r0.intValue()
            android.util.Pair r0 = r9.getPreviewSize()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r5 = r0.intValue()
            float r10 = (float) r10
            float r0 = (float) r4
            float r10 = r10 / r0
            float r11 = (float) r11
            float r0 = (float) r5
            float r11 = r11 / r0
            float r10 = java.lang.Math.min(r10, r11)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r0 < 0) goto L36
            r10 = 1
            byte[] r10 = r9.wrapJpeg(r10)
            goto L52
        L36:
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            r6.postScale(r10, r10)
            android.graphics.Bitmap r1 = r9.wrapBitmap()
            r3 = 0
            r7 = 1
            r2 = 0
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)
            r0 = 100
            byte[] r11 = com.huawei.hms.ml.common.utils.ImageConvertUtils.bitmap2Jpeg(r11, r0)
            r8 = r11
            r11 = r10
            r10 = r8
        L52:
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            android.util.Pair r10 = android.util.Pair.create(r10, r11)
            return r10
    }

    public java.nio.ByteBuffer getByteBuffer() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.byteBuffer
            return r0
    }

    public final synchronized com.huawei.hms.mlsdk.common.MLFrame getFrame(boolean r2, boolean r3) {
            r1 = this;
            monitor-enter(r1)
            java.lang.Boolean r0 = r1.frameInit     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto Lb
            monitor-exit(r1)
            return r1
        Lb:
            if (r2 != 0) goto L6f
            java.nio.ByteBuffer r2 = r1.byteBuffer     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto L12
            goto L6f
        L12:
            com.huawei.hms.mlsdk.common.MLFrame$Property r2 = r1.property     // Catch: java.lang.Throwable -> L35
            int r2 = r2.getFormatType()     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L69
            r3 = 17
            if (r2 != r3) goto L1f
            goto L69
        L1f:
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            if (r2 != r0) goto L37
            java.nio.ByteBuffer r2 = r1.byteBuffer     // Catch: java.lang.Throwable -> L35
            byte[] r2 = com.huawei.hms.ml.common.utils.ImageConvertUtils.buffer2Byte(r2)     // Catch: java.lang.Throwable -> L35
            byte[] r2 = com.huawei.hms.ml.common.utils.ImageConvertUtils.byteToNv21(r2)     // Catch: java.lang.Throwable -> L35
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)     // Catch: java.lang.Throwable -> L35
            r1.byteBuffer = r2     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r2 = move-exception
            goto L90
        L37:
            com.huawei.hms.mlsdk.common.MLFrame$Property$Creator r2 = new com.huawei.hms.mlsdk.common.MLFrame$Property$Creator     // Catch: java.lang.Throwable -> L35
            r2.<init>()     // Catch: java.lang.Throwable -> L35
            com.huawei.hms.mlsdk.common.MLFrame$Property$Creator r3 = r2.setFormatType(r3)     // Catch: java.lang.Throwable -> L35
            com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r1.property     // Catch: java.lang.Throwable -> L35
            int r0 = r0.getWidth()     // Catch: java.lang.Throwable -> L35
            com.huawei.hms.mlsdk.common.MLFrame$Property$Creator r3 = r3.setWidth(r0)     // Catch: java.lang.Throwable -> L35
            com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r1.property     // Catch: java.lang.Throwable -> L35
            int r0 = r0.getHeight()     // Catch: java.lang.Throwable -> L35
            com.huawei.hms.mlsdk.common.MLFrame$Property$Creator r3 = r3.setHeight(r0)     // Catch: java.lang.Throwable -> L35
            com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r1.property     // Catch: java.lang.Throwable -> L35
            int r0 = r0.getQuadrant()     // Catch: java.lang.Throwable -> L35
            r3.setQuadrant(r0)     // Catch: java.lang.Throwable -> L35
            com.huawei.hms.mlsdk.common.MLFrame$Property r2 = r2.create()     // Catch: java.lang.Throwable -> L35
            r1.property = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L35
            r1.frameInit = r2     // Catch: java.lang.Throwable -> L35
            monitor-exit(r1)
            return r1
        L69:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L35
            r1.frameInit = r2     // Catch: java.lang.Throwable -> L35
            monitor-exit(r1)
            return r1
        L6f:
            android.graphics.Bitmap r2 = r1.getPreviewBitmap()     // Catch: java.lang.Throwable -> L35
            r1.bitmap = r2     // Catch: java.lang.Throwable -> L35
            com.huawei.hms.mlsdk.common.MLFrame$Creator r2 = new com.huawei.hms.mlsdk.common.MLFrame$Creator     // Catch: java.lang.Throwable -> L35
            r2.<init>()     // Catch: java.lang.Throwable -> L35
            android.graphics.Bitmap r3 = r1.readBitmap()     // Catch: java.lang.Throwable -> L35
            com.huawei.hms.mlsdk.common.MLFrame$Creator r2 = r2.setBitmap(r3)     // Catch: java.lang.Throwable -> L35
            com.huawei.hms.mlsdk.common.MLFrame r2 = r2.create()     // Catch: java.lang.Throwable -> L35
            com.huawei.hms.mlsdk.common.MLFrame$Property r2 = r2.property     // Catch: java.lang.Throwable -> L35
            r1.property = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L35
            r1.frameInit = r2     // Catch: java.lang.Throwable -> L35
            monitor-exit(r1)
            return r1
        L90:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            throw r2
    }

    public android.graphics.Bitmap getPreviewBitmap() {
            r2 = this;
            byte[] r0 = r2.bytes
            if (r0 != 0) goto L15
            java.nio.ByteBuffer r0 = r2.byteBuffer
            if (r0 != 0) goto L15
            android.graphics.Bitmap r0 = r2.bitmap
            if (r0 == 0) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "At least one of bytes, byteBuffer or bitmap should be not null"
            r0.<init>(r1)
            throw r0
        L15:
            android.graphics.Bitmap r0 = r2.wrapBitmap()
            return r0
    }

    public int getRecMode() {
            r1 = this;
            int r0 = r1.recMode
            return r0
    }

    public final void initialize() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.byteBuffer
            if (r0 == 0) goto L1a
            int r1 = r0.capacity()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r0.rewind()
            r1.put(r0)
            r0.rewind()
            r1.flip()
            r2.byteBuffer = r1
        L1a:
            return
    }

    public android.graphics.Bitmap readBitmap() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.bitmap
            return r0
    }

    public void setRecMode(int r1) {
            r0 = this;
            r0.recMode = r1
            return
    }

    public final byte[] wrapJpeg(boolean r3) {
            r2 = this;
            byte[] r0 = r2.bytes
            if (r0 == 0) goto L5
            return r0
        L5:
            java.nio.ByteBuffer r0 = r2.byteBuffer
            if (r0 == 0) goto L51
            com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r2.property
            int r0 = r0.getFormatType()
            boolean r1 = r2.isSupportedYuvFormat(r0)
            if (r1 == 0) goto L49
            if (r3 == 0) goto L1f
            com.huawei.hms.mlsdk.common.MLFrame$Property r3 = r2.property
            int r3 = r3.getQuadrant()
            if (r3 != 0) goto L51
        L1f:
            java.nio.ByteBuffer r3 = r2.byteBuffer
            byte[] r3 = com.huawei.hms.ml.common.utils.ImageConvertUtils.buffer2Byte(r3)
            r1 = 842094169(0x32315659, float:1.0322389E-8)
            if (r1 != r0) goto L2e
            byte[] r3 = com.huawei.hms.ml.common.utils.ImageConvertUtils.byteToNv21(r3)
        L2e:
            com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r2.property
            int r0 = r0.getWidth()
            com.huawei.hms.mlsdk.common.MLFrame$Property r1 = r2.property
            int r1 = r1.getHeight()
            byte[] r3 = com.huawei.hms.ml.common.utils.ImageConvertUtils.nv21ToJpeg(r3, r0, r1)
            com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r2.property
            int r0 = r0.getQuadrant()
            if (r0 != 0) goto L52
            r2.bytes = r3
            goto L52
        L49:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Only support NV21 or YV12"
            r3.<init>(r0)
            throw r3
        L51:
            r3 = 0
        L52:
            if (r3 != 0) goto L60
            android.graphics.Bitmap r3 = r2.wrapBitmap()
            r0 = 100
            byte[] r3 = com.huawei.hms.ml.common.utils.ImageConvertUtils.bitmap2Jpeg(r3, r0)
            r2.bytes = r3
        L60:
            return r3
    }
}
