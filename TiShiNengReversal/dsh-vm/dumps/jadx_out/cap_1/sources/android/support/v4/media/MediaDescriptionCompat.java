package android.support.v4.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MediaDescriptionCompat implements android.os.Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaDescriptionCompat> CREATOR = null;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final java.lang.String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final java.lang.String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final java.lang.String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final java.lang.String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private final java.lang.CharSequence mDescription;
    private java.lang.Object mDescriptionObj;
    private final android.os.Bundle mExtras;
    private final android.graphics.Bitmap mIcon;
    private final android.net.Uri mIconUri;
    private final java.lang.String mMediaId;
    private final android.net.Uri mMediaUri;
    private final java.lang.CharSequence mSubtitle;
    private final java.lang.CharSequence mTitle;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private java.lang.CharSequence mDescription;
        private android.os.Bundle mExtras;
        private android.graphics.Bitmap mIcon;
        private android.net.Uri mIconUri;
        private java.lang.String mMediaId;
        private android.net.Uri mMediaUri;
        private java.lang.CharSequence mSubtitle;
        private java.lang.CharSequence mTitle;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public android.support.v4.media.MediaDescriptionCompat build() {
                r9 = this;
                android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
                java.lang.String r1 = r9.mMediaId
                java.lang.CharSequence r2 = r9.mTitle
                java.lang.CharSequence r3 = r9.mSubtitle
                java.lang.CharSequence r4 = r9.mDescription
                android.graphics.Bitmap r5 = r9.mIcon
                android.net.Uri r6 = r9.mIconUri
                android.os.Bundle r7 = r9.mExtras
                android.net.Uri r8 = r9.mMediaUri
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setDescription(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.mDescription = r1
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setExtras(@androidx.annotation.Nullable android.os.Bundle r1) {
                r0 = this;
                r0.mExtras = r1
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setIconBitmap(@androidx.annotation.Nullable android.graphics.Bitmap r1) {
                r0 = this;
                r0.mIcon = r1
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setIconUri(@androidx.annotation.Nullable android.net.Uri r1) {
                r0 = this;
                r0.mIconUri = r1
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setMediaId(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.mMediaId = r1
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setMediaUri(@androidx.annotation.Nullable android.net.Uri r1) {
                r0 = this;
                r0.mMediaUri = r1
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setSubtitle(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.mSubtitle = r1
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setTitle(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.mTitle = r1
                return r0
        }
    }

    static {
            android.support.v4.media.MediaDescriptionCompat$1 r0 = new android.support.v4.media.MediaDescriptionCompat$1
            r0.<init>()
            android.support.v4.media.MediaDescriptionCompat.CREATOR = r0
            return
    }

    MediaDescriptionCompat(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.readString()
            r2.mMediaId = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r1 = r0.createFromParcel(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.mTitle = r1
            java.lang.Object r1 = r0.createFromParcel(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.mSubtitle = r1
            java.lang.Object r0 = r0.createFromParcel(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.mDescription = r0
            java.lang.Class<android.support.v4.media.MediaDescriptionCompat> r0 = android.support.v4.media.MediaDescriptionCompat.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r1 = r3.readParcelable(r0)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r2.mIcon = r1
            android.os.Parcelable r1 = r3.readParcelable(r0)
            android.net.Uri r1 = (android.net.Uri) r1
            r2.mIconUri = r1
            android.os.Bundle r1 = r3.readBundle(r0)
            r2.mExtras = r1
            android.os.Parcelable r3 = r3.readParcelable(r0)
            android.net.Uri r3 = (android.net.Uri) r3
            r2.mMediaUri = r3
            return
    }

    MediaDescriptionCompat(java.lang.String r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, android.graphics.Bitmap r5, android.net.Uri r6, android.os.Bundle r7, android.net.Uri r8) {
            r0 = this;
            r0.<init>()
            r0.mMediaId = r1
            r0.mTitle = r2
            r0.mSubtitle = r3
            r0.mDescription = r4
            r0.mIcon = r5
            r0.mIconUri = r6
            r0.mExtras = r7
            r0.mMediaUri = r8
            return
    }

    public static android.support.v4.media.MediaDescriptionCompat fromMediaDescription(java.lang.Object r9) {
            r0 = 0
            if (r9 == 0) goto L7a
            int r1 = android.os.Build.VERSION.SDK_INT
            android.support.v4.media.MediaDescriptionCompat$Builder r2 = new android.support.v4.media.MediaDescriptionCompat$Builder
            r2.<init>()
            java.lang.String r3 = android.support.v4.media.MediaDescriptionCompatApi21.getMediaId(r9)
            r2.setMediaId(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompatApi21.getTitle(r9)
            r2.setTitle(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompatApi21.getSubtitle(r9)
            r2.setSubtitle(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompatApi21.getDescription(r9)
            r2.setDescription(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.MediaDescriptionCompatApi21.getIconBitmap(r9)
            r2.setIconBitmap(r3)
            android.net.Uri r3 = android.support.v4.media.MediaDescriptionCompatApi21.getIconUri(r9)
            r2.setIconUri(r3)
            android.os.Bundle r3 = android.support.v4.media.MediaDescriptionCompatApi21.getExtras(r9)
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L46
            android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L47
        L46:
            r5 = r0
        L47:
            if (r5 == 0) goto L5f
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L59
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L59
            goto L60
        L59:
            r3.remove(r4)
            r3.remove(r6)
        L5f:
            r0 = r3
        L60:
            r2.setExtras(r0)
            if (r5 == 0) goto L69
            r2.setMediaUri(r5)
            goto L74
        L69:
            r0 = 23
            if (r1 < r0) goto L74
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompatApi23.getMediaUri(r9)
            r2.setMediaUri(r0)
        L74:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.build()
            r0.mDescriptionObj = r9
        L7a:
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mDescription
            return r0
    }

    @androidx.annotation.Nullable
    public android.os.Bundle getExtras() {
            r1 = this;
            android.os.Bundle r0 = r1.mExtras
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.Bitmap getIconBitmap() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.mIcon
            return r0
    }

    @androidx.annotation.Nullable
    public android.net.Uri getIconUri() {
            r1 = this;
            android.net.Uri r0 = r1.mIconUri
            return r0
    }

    public java.lang.Object getMediaDescription() {
            r6 = this;
            java.lang.Object r0 = r6.mDescriptionObj
            if (r0 != 0) goto L56
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r1 = android.support.v4.media.MediaDescriptionCompatApi21.Builder.newInstance()
            java.lang.String r2 = r6.mMediaId
            android.support.v4.media.MediaDescriptionCompatApi21.Builder.setMediaId(r1, r2)
            java.lang.CharSequence r2 = r6.mTitle
            android.support.v4.media.MediaDescriptionCompatApi21.Builder.setTitle(r1, r2)
            java.lang.CharSequence r2 = r6.mSubtitle
            android.support.v4.media.MediaDescriptionCompatApi21.Builder.setSubtitle(r1, r2)
            java.lang.CharSequence r2 = r6.mDescription
            android.support.v4.media.MediaDescriptionCompatApi21.Builder.setDescription(r1, r2)
            android.graphics.Bitmap r2 = r6.mIcon
            android.support.v4.media.MediaDescriptionCompatApi21.Builder.setIconBitmap(r1, r2)
            android.net.Uri r2 = r6.mIconUri
            android.support.v4.media.MediaDescriptionCompatApi21.Builder.setIconUri(r1, r2)
            android.os.Bundle r2 = r6.mExtras
            r3 = 23
            if (r0 >= r3) goto L46
            android.net.Uri r4 = r6.mMediaUri
            if (r4 == 0) goto L46
            if (r2 != 0) goto L3f
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r4 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            r5 = 1
            r2.putBoolean(r4, r5)
        L3f:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            android.net.Uri r5 = r6.mMediaUri
            r2.putParcelable(r4, r5)
        L46:
            android.support.v4.media.MediaDescriptionCompatApi21.Builder.setExtras(r1, r2)
            if (r0 < r3) goto L50
            android.net.Uri r0 = r6.mMediaUri
            android.support.v4.media.MediaDescriptionCompatApi23.Builder.setMediaUri(r1, r0)
        L50:
            java.lang.Object r0 = android.support.v4.media.MediaDescriptionCompatApi21.Builder.build(r1)
            r6.mDescriptionObj = r0
        L56:
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getMediaId() {
            r1 = this;
            java.lang.String r0 = r1.mMediaId
            return r0
    }

    @androidx.annotation.Nullable
    public android.net.Uri getMediaUri() {
            r1 = this;
            android.net.Uri r0 = r1.mMediaUri
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mSubtitle
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitle
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.CharSequence r1 = r3.mTitle
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.CharSequence r2 = r3.mSubtitle
            r0.append(r2)
            r0.append(r1)
            java.lang.CharSequence r1 = r3.mDescription
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.Object r0 = r1.getMediaDescription()
            android.support.v4.media.MediaDescriptionCompatApi21.writeToParcel(r0, r2, r3)
            return
    }
}
