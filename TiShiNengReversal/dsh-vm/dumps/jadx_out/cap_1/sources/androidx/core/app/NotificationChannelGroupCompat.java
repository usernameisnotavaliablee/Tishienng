package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NotificationChannelGroupCompat {
    private boolean mBlocked;
    private java.util.List<androidx.core.app.NotificationChannelCompat> mChannels;
    java.lang.String mDescription;
    final java.lang.String mId;
    java.lang.CharSequence mName;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(26)
    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.app.NotificationChannelGroup createNotificationChannelGroup(java.lang.String r1, java.lang.CharSequence r2) {
                android.app.NotificationChannelGroup r0 = new android.app.NotificationChannelGroup
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.util.List<android.app.NotificationChannel> getChannels(android.app.NotificationChannelGroup r0) {
                java.util.List r0 = r0.getChannels()
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getGroup(android.app.NotificationChannel r0) {
                java.lang.String r0 = r0.getGroup()
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getId(android.app.NotificationChannelGroup r0) {
                java.lang.String r0 = r0.getId()
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.lang.CharSequence getName(android.app.NotificationChannelGroup r0) {
                java.lang.CharSequence r0 = r0.getName()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getDescription(android.app.NotificationChannelGroup r0) {
                java.lang.String r0 = r0.getDescription()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean isBlocked(android.app.NotificationChannelGroup r0) {
                boolean r0 = r0.isBlocked()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setDescription(android.app.NotificationChannelGroup r0, java.lang.String r1) {
                r0.setDescription(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        final androidx.core.app.NotificationChannelGroupCompat mGroup;

        public Builder(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                r1.<init>()
                androidx.core.app.NotificationChannelGroupCompat r0 = new androidx.core.app.NotificationChannelGroupCompat
                r0.<init>(r2)
                r1.mGroup = r0
                return
        }

        @androidx.annotation.NonNull
        public androidx.core.app.NotificationChannelGroupCompat build() {
                r1 = this;
                androidx.core.app.NotificationChannelGroupCompat r0 = r1.mGroup
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.app.NotificationChannelGroupCompat.Builder setDescription(@androidx.annotation.Nullable java.lang.String r2) {
                r1 = this;
                androidx.core.app.NotificationChannelGroupCompat r0 = r1.mGroup
                r0.mDescription = r2
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.app.NotificationChannelGroupCompat.Builder setName(@androidx.annotation.Nullable java.lang.CharSequence r2) {
                r1 = this;
                androidx.core.app.NotificationChannelGroupCompat r0 = r1.mGroup
                r0.mName = r2
                return r1
        }
    }

    @androidx.annotation.RequiresApi(28)
    NotificationChannelGroupCompat(@androidx.annotation.NonNull android.app.NotificationChannelGroup r2) {
            r1 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.<init>(r2, r0)
            return
    }

    @androidx.annotation.RequiresApi(26)
    NotificationChannelGroupCompat(@androidx.annotation.NonNull android.app.NotificationChannelGroup r4, @androidx.annotation.NonNull java.util.List<android.app.NotificationChannel> r5) {
            r3 = this;
            java.lang.String r0 = androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getId(r4)
            r3.<init>(r0)
            java.lang.CharSequence r0 = androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getName(r4)
            r3.mName = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L19
            java.lang.String r2 = androidx.core.app.NotificationChannelGroupCompat.Api28Impl.getDescription(r4)
            r3.mDescription = r2
        L19:
            if (r0 < r1) goto L2c
            boolean r5 = androidx.core.app.NotificationChannelGroupCompat.Api28Impl.isBlocked(r4)
            r3.mBlocked = r5
            java.util.List r4 = androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getChannels(r4)
            java.util.List r4 = r3.getChannelsCompat(r4)
            r3.mChannels = r4
            return
        L2c:
            java.util.List r4 = r3.getChannelsCompat(r5)
            r3.mChannels = r4
            return
    }

    NotificationChannelGroupCompat(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.mChannels = r0
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.mId = r2
            return
    }

    @androidx.annotation.RequiresApi(26)
    private java.util.List<androidx.core.app.NotificationChannelCompat> getChannelsCompat(java.util.List<android.app.NotificationChannel> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r5.next()
            android.app.NotificationChannel r1 = androidx.core.app.i.a(r1)
            java.lang.String r2 = r4.mId
            java.lang.String r3 = androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getGroup(r1)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L9
            androidx.core.app.NotificationChannelCompat r2 = new androidx.core.app.NotificationChannelCompat
            r2.<init>(r1)
            r0.add(r2)
            goto L9
        L2c:
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.core.app.NotificationChannelCompat> getChannels() {
            r1 = this;
            java.util.List<androidx.core.app.NotificationChannelCompat> r0 = r1.mChannels
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.mDescription
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.mId
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getName() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mName
            return r0
    }

    android.app.NotificationChannelGroup getNotificationChannelGroup() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r1 = r3.mId
            java.lang.CharSequence r2 = r3.mName
            android.app.NotificationChannelGroup r1 = androidx.core.app.NotificationChannelGroupCompat.Api26Impl.createNotificationChannelGroup(r1, r2)
            r2 = 28
            if (r0 < r2) goto L19
            java.lang.String r0 = r3.mDescription
            androidx.core.app.NotificationChannelGroupCompat.Api28Impl.setDescription(r1, r0)
        L19:
            return r1
    }

    public boolean isBlocked() {
            r1 = this;
            boolean r0 = r1.mBlocked
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.app.NotificationChannelGroupCompat.Builder toBuilder() {
            r2 = this;
            androidx.core.app.NotificationChannelGroupCompat$Builder r0 = new androidx.core.app.NotificationChannelGroupCompat$Builder
            java.lang.String r1 = r2.mId
            r0.<init>(r1)
            java.lang.CharSequence r1 = r2.mName
            androidx.core.app.NotificationChannelGroupCompat$Builder r0 = r0.setName(r1)
            java.lang.String r1 = r2.mDescription
            androidx.core.app.NotificationChannelGroupCompat$Builder r0 = r0.setDescription(r1)
            return r0
    }
}
