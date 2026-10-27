package androidx.emoji2.viewsintegration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class EmojiEditableFactory extends android.text.Editable.Factory {
    private static final java.lang.Object INSTANCE_LOCK = null;

    @androidx.annotation.GuardedBy("INSTANCE_LOCK")
    private static volatile android.text.Editable.Factory sInstance;

    @androidx.annotation.Nullable
    private static java.lang.Class<?> sWatcherClass;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.emoji2.viewsintegration.EmojiEditableFactory.INSTANCE_LOCK = r0
            return
    }

    @android.annotation.SuppressLint({"PrivateApi"})
    private EmojiEditableFactory() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "android.text.DynamicLayout$ChangeWatcher"
            java.lang.Class<androidx.emoji2.viewsintegration.EmojiEditableFactory> r1 = androidx.emoji2.viewsintegration.EmojiEditableFactory.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r2, r1)     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.viewsintegration.EmojiEditableFactory.sWatcherClass = r0     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    public static android.text.Editable.Factory getInstance() {
            android.text.Editable$Factory r0 = androidx.emoji2.viewsintegration.EmojiEditableFactory.sInstance
            if (r0 != 0) goto L19
            java.lang.Object r0 = androidx.emoji2.viewsintegration.EmojiEditableFactory.INSTANCE_LOCK
            monitor-enter(r0)
            android.text.Editable$Factory r1 = androidx.emoji2.viewsintegration.EmojiEditableFactory.sInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            androidx.emoji2.viewsintegration.EmojiEditableFactory r1 = new androidx.emoji2.viewsintegration.EmojiEditableFactory     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            androidx.emoji2.viewsintegration.EmojiEditableFactory.sInstance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            android.text.Editable$Factory r0 = androidx.emoji2.viewsintegration.EmojiEditableFactory.sInstance
            return r0
    }

    @Override // android.text.Editable.Factory
    public android.text.Editable newEditable(@androidx.annotation.NonNull java.lang.CharSequence r2) {
            r1 = this;
            java.lang.Class<?> r0 = androidx.emoji2.viewsintegration.EmojiEditableFactory.sWatcherClass
            if (r0 == 0) goto L9
            androidx.emoji2.text.SpannableBuilder r2 = androidx.emoji2.text.SpannableBuilder.create(r0, r2)
            return r2
        L9:
            android.text.Editable r2 = super.newEditable(r2)
            return r2
    }
}
