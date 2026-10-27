package android.support.v4.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaDescriptionCompatApi21 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Builder {
        private Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.Object build(java.lang.Object r0) {
                android.media.MediaDescription$Builder r0 = (android.media.MediaDescription.Builder) r0
                android.media.MediaDescription r0 = r0.build()
                return r0
        }

        public static java.lang.Object newInstance() {
                android.media.MediaDescription$Builder r0 = new android.media.MediaDescription$Builder
                r0.<init>()
                return r0
        }

        public static void setDescription(java.lang.Object r0, java.lang.CharSequence r1) {
                android.media.MediaDescription$Builder r0 = (android.media.MediaDescription.Builder) r0
                r0.setDescription(r1)
                return
        }

        public static void setExtras(java.lang.Object r0, android.os.Bundle r1) {
                android.media.MediaDescription$Builder r0 = (android.media.MediaDescription.Builder) r0
                r0.setExtras(r1)
                return
        }

        public static void setIconBitmap(java.lang.Object r0, android.graphics.Bitmap r1) {
                android.media.MediaDescription$Builder r0 = (android.media.MediaDescription.Builder) r0
                r0.setIconBitmap(r1)
                return
        }

        public static void setIconUri(java.lang.Object r0, android.net.Uri r1) {
                android.media.MediaDescription$Builder r0 = (android.media.MediaDescription.Builder) r0
                r0.setIconUri(r1)
                return
        }

        public static void setMediaId(java.lang.Object r0, java.lang.String r1) {
                android.media.MediaDescription$Builder r0 = (android.media.MediaDescription.Builder) r0
                r0.setMediaId(r1)
                return
        }

        public static void setSubtitle(java.lang.Object r0, java.lang.CharSequence r1) {
                android.media.MediaDescription$Builder r0 = (android.media.MediaDescription.Builder) r0
                r0.setSubtitle(r1)
                return
        }

        public static void setTitle(java.lang.Object r0, java.lang.CharSequence r1) {
                android.media.MediaDescription$Builder r0 = (android.media.MediaDescription.Builder) r0
                r0.setTitle(r1)
                return
        }
    }

    private MediaDescriptionCompatApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object fromParcel(android.os.Parcel r1) {
            android.os.Parcelable$Creator r0 = android.media.MediaDescription.CREATOR
            java.lang.Object r1 = r0.createFromParcel(r1)
            return r1
    }

    public static java.lang.CharSequence getDescription(java.lang.Object r0) {
            android.media.MediaDescription r0 = (android.media.MediaDescription) r0
            java.lang.CharSequence r0 = r0.getDescription()
            return r0
    }

    public static android.os.Bundle getExtras(java.lang.Object r0) {
            android.media.MediaDescription r0 = (android.media.MediaDescription) r0
            android.os.Bundle r0 = r0.getExtras()
            return r0
    }

    public static android.graphics.Bitmap getIconBitmap(java.lang.Object r0) {
            android.media.MediaDescription r0 = (android.media.MediaDescription) r0
            android.graphics.Bitmap r0 = r0.getIconBitmap()
            return r0
    }

    public static android.net.Uri getIconUri(java.lang.Object r0) {
            android.media.MediaDescription r0 = (android.media.MediaDescription) r0
            android.net.Uri r0 = r0.getIconUri()
            return r0
    }

    public static java.lang.String getMediaId(java.lang.Object r0) {
            android.media.MediaDescription r0 = (android.media.MediaDescription) r0
            java.lang.String r0 = r0.getMediaId()
            return r0
    }

    public static java.lang.CharSequence getSubtitle(java.lang.Object r0) {
            android.media.MediaDescription r0 = (android.media.MediaDescription) r0
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    public static java.lang.CharSequence getTitle(java.lang.Object r0) {
            android.media.MediaDescription r0 = (android.media.MediaDescription) r0
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    public static void writeToParcel(java.lang.Object r0, android.os.Parcel r1, int r2) {
            android.media.MediaDescription r0 = (android.media.MediaDescription) r0
            r0.writeToParcel(r1, r2)
            return
    }
}
