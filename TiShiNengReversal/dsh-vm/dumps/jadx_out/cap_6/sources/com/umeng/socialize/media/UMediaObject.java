package com.umeng.socialize.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface UMediaObject {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.socialize.media.UMediaObject$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum MediaType extends java.lang.Enum<com.umeng.socialize.media.UMediaObject.MediaType> {
        private static final /* synthetic */ com.umeng.socialize.media.UMediaObject.MediaType[] $VALUES = null;
        public static final com.umeng.socialize.media.UMediaObject.MediaType IMAGE = null;
        public static final com.umeng.socialize.media.UMediaObject.MediaType MUSIC = null;
        public static final com.umeng.socialize.media.UMediaObject.MediaType TEXT = null;
        public static final com.umeng.socialize.media.UMediaObject.MediaType TEXT_IMAGE = null;
        public static final com.umeng.socialize.media.UMediaObject.MediaType VEDIO = null;
        public static final com.umeng.socialize.media.UMediaObject.MediaType WEBPAGE = null;







        static {
                com.umeng.socialize.media.UMediaObject$MediaType$1 r0 = new com.umeng.socialize.media.UMediaObject$MediaType$1
                java.lang.String r1 = "IMAGE"
                r2 = 0
                r0.<init>(r1, r2)
                com.umeng.socialize.media.UMediaObject.MediaType.IMAGE = r0
                com.umeng.socialize.media.UMediaObject$MediaType$2 r1 = new com.umeng.socialize.media.UMediaObject$MediaType$2
                java.lang.String r3 = "VEDIO"
                r4 = 1
                r1.<init>(r3, r4)
                com.umeng.socialize.media.UMediaObject.MediaType.VEDIO = r1
                com.umeng.socialize.media.UMediaObject$MediaType$3 r3 = new com.umeng.socialize.media.UMediaObject$MediaType$3
                java.lang.String r5 = "MUSIC"
                r6 = 2
                r3.<init>(r5, r6)
                com.umeng.socialize.media.UMediaObject.MediaType.MUSIC = r3
                com.umeng.socialize.media.UMediaObject$MediaType$4 r5 = new com.umeng.socialize.media.UMediaObject$MediaType$4
                java.lang.String r7 = "TEXT"
                r8 = 3
                r5.<init>(r7, r8)
                com.umeng.socialize.media.UMediaObject.MediaType.TEXT = r5
                com.umeng.socialize.media.UMediaObject$MediaType$5 r7 = new com.umeng.socialize.media.UMediaObject$MediaType$5
                java.lang.String r9 = "TEXT_IMAGE"
                r10 = 4
                r7.<init>(r9, r10)
                com.umeng.socialize.media.UMediaObject.MediaType.TEXT_IMAGE = r7
                com.umeng.socialize.media.UMediaObject$MediaType$6 r9 = new com.umeng.socialize.media.UMediaObject$MediaType$6
                java.lang.String r11 = "WEBPAGE"
                r12 = 5
                r9.<init>(r11, r12)
                com.umeng.socialize.media.UMediaObject.MediaType.WEBPAGE = r9
                r11 = 6
                com.umeng.socialize.media.UMediaObject$MediaType[] r11 = new com.umeng.socialize.media.UMediaObject.MediaType[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                com.umeng.socialize.media.UMediaObject.MediaType.$VALUES = r11
                return
        }

        MediaType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ MediaType(java.lang.String r1, int r2, com.umeng.socialize.media.UMediaObject.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.umeng.socialize.media.UMediaObject.MediaType valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.socialize.media.UMediaObject$MediaType> r0 = com.umeng.socialize.media.UMediaObject.MediaType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.socialize.media.UMediaObject$MediaType r1 = (com.umeng.socialize.media.UMediaObject.MediaType) r1
                return r1
        }

        public static com.umeng.socialize.media.UMediaObject.MediaType[] values() {
                com.umeng.socialize.media.UMediaObject$MediaType[] r0 = com.umeng.socialize.media.UMediaObject.MediaType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.umeng.socialize.media.UMediaObject$MediaType[] r0 = (com.umeng.socialize.media.UMediaObject.MediaType[]) r0
                return r0
        }
    }

    com.umeng.socialize.media.UMediaObject.MediaType getMediaType();

    boolean isUrlMedia();

    byte[] toByte();

    java.lang.String toUrl();

    java.util.Map<java.lang.String, java.lang.Object> toUrlExtraParams();
}
