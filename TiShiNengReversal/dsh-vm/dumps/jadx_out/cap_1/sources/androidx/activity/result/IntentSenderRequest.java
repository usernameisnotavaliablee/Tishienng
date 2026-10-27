package androidx.activity.result;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class IntentSenderRequest implements android.os.Parcelable {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<androidx.activity.result.IntentSenderRequest> CREATOR = null;

    @org.jetbrains.annotations.NotNull
    public static final androidx.activity.result.IntentSenderRequest.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private final android.content.Intent fillInIntent;
    private final int flagsMask;
    private final int flagsValues;

    @org.jetbrains.annotations.NotNull
    private final android.content.IntentSender intentSender;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {

        @org.jetbrains.annotations.Nullable
        private android.content.Intent fillInIntent;
        private int flagsMask;
        private int flagsValues;

        @org.jetbrains.annotations.NotNull
        private final android.content.IntentSender intentSender;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
        private @interface Flag {
        }

        public Builder(@org.jetbrains.annotations.NotNull android.app.PendingIntent r2) {
                r1 = this;
                java.lang.String r0 = "pendingIntent"
                kotlin.jvm.internal.g0.p(r2, r0)
                android.content.IntentSender r2 = r2.getIntentSender()
                java.lang.String r0 = "pendingIntent.intentSender"
                kotlin.jvm.internal.g0.o(r2, r0)
                r1.<init>(r2)
                return
        }

        public Builder(@org.jetbrains.annotations.NotNull android.content.IntentSender r2) {
                r1 = this;
                java.lang.String r0 = "intentSender"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.intentSender = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.activity.result.IntentSenderRequest build() {
                r5 = this;
                androidx.activity.result.IntentSenderRequest r0 = new androidx.activity.result.IntentSenderRequest
                android.content.IntentSender r1 = r5.intentSender
                android.content.Intent r2 = r5.fillInIntent
                int r3 = r5.flagsMask
                int r4 = r5.flagsValues
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.activity.result.IntentSenderRequest.Builder setFillInIntent(@org.jetbrains.annotations.Nullable android.content.Intent r1) {
                r0 = this;
                r0.fillInIntent = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.activity.result.IntentSenderRequest.Builder setFlags(int r1, int r2) {
                r0 = this;
                r0.flagsValues = r1
                r0.flagsMask = r2
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ void getCREATOR$annotations() {
                return
        }
    }

    static {
            androidx.activity.result.IntentSenderRequest$Companion r0 = new androidx.activity.result.IntentSenderRequest$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.activity.result.IntentSenderRequest.Companion = r0
            androidx.activity.result.IntentSenderRequest$Companion$CREATOR$1 r0 = new androidx.activity.result.IntentSenderRequest$Companion$CREATOR$1
            r0.<init>()
            androidx.activity.result.IntentSenderRequest.CREATOR = r0
            return
    }

    public IntentSenderRequest(@org.jetbrains.annotations.NotNull android.content.IntentSender r2, @org.jetbrains.annotations.Nullable android.content.Intent r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "intentSender"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.intentSender = r2
            r1.fillInIntent = r3
            r1.flagsMask = r4
            r1.flagsValues = r5
            return
    }

    public /* synthetic */ IntentSenderRequest(android.content.IntentSender r2, android.content.Intent r3, int r4, int r5, int r6, kotlin.jvm.internal.v r7) {
            r1 = this;
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r3 = 0
        L5:
            r7 = r6 & 4
            r0 = 0
            if (r7 == 0) goto Lb
            r4 = 0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = 0
        L10:
            r1.<init>(r2, r3, r4, r5)
            return
    }

    public IntentSenderRequest(@org.jetbrains.annotations.NotNull android.os.Parcel r4) {
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.g0.m(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final android.content.Intent getFillInIntent() {
            r1 = this;
            android.content.Intent r0 = r1.fillInIntent
            return r0
    }

    public final int getFlagsMask() {
            r1 = this;
            int r0 = r1.flagsMask
            return r0
    }

    public final int getFlagsValues() {
            r1 = this;
            int r0 = r1.flagsValues
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final android.content.IntentSender getIntentSender() {
            r1 = this;
            android.content.IntentSender r0 = r1.intentSender
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r0 = "dest"
            kotlin.jvm.internal.g0.p(r2, r0)
            android.content.IntentSender r0 = r1.intentSender
            r2.writeParcelable(r0, r3)
            android.content.Intent r0 = r1.fillInIntent
            r2.writeParcelable(r0, r3)
            int r3 = r1.flagsMask
            r2.writeInt(r3)
            int r3 = r1.flagsValues
            r2.writeInt(r3)
            return
    }
}
