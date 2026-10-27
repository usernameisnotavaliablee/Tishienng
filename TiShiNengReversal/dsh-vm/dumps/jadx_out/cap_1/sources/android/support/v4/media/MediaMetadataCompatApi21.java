package android.support.v4.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaMetadataCompatApi21 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.Object build(java.lang.Object r0) {
                android.media.MediaMetadata$Builder r0 = (android.media.MediaMetadata.Builder) r0
                android.media.MediaMetadata r0 = r0.build()
                return r0
        }

        public static java.lang.Object newInstance() {
                android.media.MediaMetadata$Builder r0 = new android.media.MediaMetadata$Builder
                r0.<init>()
                return r0
        }

        public static void putBitmap(java.lang.Object r0, java.lang.String r1, android.graphics.Bitmap r2) {
                android.media.MediaMetadata$Builder r0 = (android.media.MediaMetadata.Builder) r0
                r0.putBitmap(r1, r2)
                return
        }

        public static void putLong(java.lang.Object r0, java.lang.String r1, long r2) {
                android.media.MediaMetadata$Builder r0 = (android.media.MediaMetadata.Builder) r0
                r0.putLong(r1, r2)
                return
        }

        public static void putRating(java.lang.Object r0, java.lang.String r1, java.lang.Object r2) {
                android.media.MediaMetadata$Builder r0 = (android.media.MediaMetadata.Builder) r0
                android.media.Rating r2 = (android.media.Rating) r2
                r0.putRating(r1, r2)
                return
        }

        public static void putString(java.lang.Object r0, java.lang.String r1, java.lang.String r2) {
                android.media.MediaMetadata$Builder r0 = (android.media.MediaMetadata.Builder) r0
                r0.putString(r1, r2)
                return
        }

        public static void putText(java.lang.Object r0, java.lang.String r1, java.lang.CharSequence r2) {
                android.media.MediaMetadata$Builder r0 = (android.media.MediaMetadata.Builder) r0
                r0.putText(r1, r2)
                return
        }
    }

    private MediaMetadataCompatApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object createFromParcel(android.os.Parcel r1) {
            android.os.Parcelable$Creator r0 = android.media.MediaMetadata.CREATOR
            java.lang.Object r1 = r0.createFromParcel(r1)
            return r1
    }

    public static android.graphics.Bitmap getBitmap(java.lang.Object r0, java.lang.String r1) {
            android.media.MediaMetadata r0 = (android.media.MediaMetadata) r0
            android.graphics.Bitmap r0 = r0.getBitmap(r1)
            return r0
    }

    public static long getLong(java.lang.Object r0, java.lang.String r1) {
            android.media.MediaMetadata r0 = (android.media.MediaMetadata) r0
            long r0 = r0.getLong(r1)
            return r0
    }

    public static java.lang.Object getRating(java.lang.Object r0, java.lang.String r1) {
            android.media.MediaMetadata r0 = (android.media.MediaMetadata) r0
            android.media.Rating r0 = r0.getRating(r1)
            return r0
    }

    public static java.lang.CharSequence getText(java.lang.Object r0, java.lang.String r1) {
            android.media.MediaMetadata r0 = (android.media.MediaMetadata) r0
            java.lang.CharSequence r0 = r0.getText(r1)
            return r0
    }

    public static java.util.Set<java.lang.String> keySet(java.lang.Object r0) {
            android.media.MediaMetadata r0 = (android.media.MediaMetadata) r0
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public static void writeToParcel(java.lang.Object r0, android.os.Parcel r1, int r2) {
            android.media.MediaMetadata r0 = (android.media.MediaMetadata) r0
            r0.writeToParcel(r1, r2)
            return
    }
}
