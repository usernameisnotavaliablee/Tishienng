package androidx.core.view.inputmethod;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class InputConnectionCompat {
    private static final java.lang.String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final java.lang.String COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final java.lang.String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final java.lang.String COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final java.lang.String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final java.lang.String COMMIT_CONTENT_FLAGS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final java.lang.String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final java.lang.String COMMIT_CONTENT_INTEROP_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final java.lang.String COMMIT_CONTENT_LINK_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final java.lang.String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final java.lang.String COMMIT_CONTENT_OPTS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final java.lang.String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final java.lang.String COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final java.lang.String COMMIT_CONTENT_RESULT_RECEIVER_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final java.lang.String EXTRA_INPUT_CONTENT_INFO = "androidx.core.view.extra.INPUT_CONTENT_INFO";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;
    private static final java.lang.String LOG_TAG = "InputConnectionCompat";



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(25)
    static class Api25Impl {
        private Api25Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static boolean commitContent(android.view.inputmethod.InputConnection r0, android.view.inputmethod.InputContentInfo r1, int r2, android.os.Bundle r3) {
                boolean r0 = r0.commitContent(r1, r2, r3)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnCommitContentListener {
        boolean onCommitContent(@androidx.annotation.NonNull androidx.core.view.inputmethod.InputContentInfoCompat r1, int r2, @androidx.annotation.Nullable android.os.Bundle r3);
    }

    @java.lang.Deprecated
    public InputConnectionCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ boolean a(android.view.View r5, androidx.core.view.inputmethod.InputContentInfoCompat r6, int r7, android.os.Bundle r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L29
            r7 = r7 & r3
            if (r7 == 0) goto L29
            r6.requestPermission()     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = r6.unwrap()
            android.os.Parcelable r7 = (android.os.Parcelable) r7
            if (r8 != 0) goto L1c
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            goto L22
        L1c:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r8)
            r8 = r0
        L22:
            java.lang.String r0 = "androidx.core.view.extra.INPUT_CONTENT_INFO"
            r8.putParcelable(r0, r7)
            goto L29
        L28:
            return r2
        L29:
            android.content.ClipData r7 = new android.content.ClipData
            android.content.ClipDescription r0 = r6.getDescription()
            android.content.ClipData$Item r1 = new android.content.ClipData$Item
            android.net.Uri r4 = r6.getContentUri()
            r1.<init>(r4)
            r7.<init>(r0, r1)
            androidx.core.view.ContentInfoCompat$Builder r0 = new androidx.core.view.ContentInfoCompat$Builder
            r1 = 2
            r0.<init>(r7, r1)
            android.net.Uri r6 = r6.getLinkUri()
            androidx.core.view.ContentInfoCompat$Builder r6 = r0.setLinkUri(r6)
            androidx.core.view.ContentInfoCompat$Builder r6 = r6.setExtras(r8)
            androidx.core.view.ContentInfoCompat r6 = r6.build()
            androidx.core.view.ContentInfoCompat r5 = androidx.core.view.ViewCompat.performReceiveContent(r5, r6)
            if (r5 != 0) goto L58
            return r3
        L58:
            return r2
    }

    public static boolean commitContent(@androidx.annotation.NonNull android.view.inputmethod.InputConnection r3, @androidx.annotation.NonNull android.view.inputmethod.EditorInfo r4, @androidx.annotation.NonNull androidx.core.view.inputmethod.InputContentInfoCompat r5, int r6, @androidx.annotation.Nullable android.os.Bundle r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L13
            java.lang.Object r4 = r5.unwrap()
            android.view.inputmethod.InputContentInfo r4 = androidx.core.view.inputmethod.c.a(r4)
            boolean r3 = androidx.core.view.inputmethod.InputConnectionCompat.Api25Impl.commitContent(r3, r4, r6, r7)
            return r3
        L13:
            int r4 = androidx.core.view.inputmethod.EditorInfoCompat.getProtocol(r4)
            r0 = 2
            if (r4 == r0) goto L22
            r0 = 3
            r1 = 0
            if (r4 == r0) goto L23
            r0 = 4
            if (r4 == r0) goto L23
            return r1
        L22:
            r1 = 1
        L23:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            if (r1 == 0) goto L2d
            java.lang.String r0 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L2f
        L2d:
            java.lang.String r0 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L2f:
            android.net.Uri r2 = r5.getContentUri()
            r4.putParcelable(r0, r2)
            if (r1 == 0) goto L3b
            java.lang.String r0 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L3d
        L3b:
            java.lang.String r0 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L3d:
            android.content.ClipDescription r2 = r5.getDescription()
            r4.putParcelable(r0, r2)
            if (r1 == 0) goto L49
            java.lang.String r0 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L4b
        L49:
            java.lang.String r0 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L4b:
            android.net.Uri r5 = r5.getLinkUri()
            r4.putParcelable(r0, r5)
            if (r1 == 0) goto L57
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L59
        L57:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L59:
            r4.putInt(r5, r6)
            if (r1 == 0) goto L61
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L63
        L61:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L63:
            r4.putParcelable(r5, r7)
            if (r1 == 0) goto L6b
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            goto L6d
        L6b:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
        L6d:
            boolean r3 = r3.performPrivateCommand(r5, r4)
            return r3
    }

    @androidx.annotation.NonNull
    private static androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener createOnCommitContentListenerUsingPerformReceiveContent(@androidx.annotation.NonNull android.view.View r1) {
            androidx.core.util.Preconditions.checkNotNull(r1)
            androidx.core.view.inputmethod.d r0 = new androidx.core.view.inputmethod.d
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.view.inputmethod.InputConnection createWrapper(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull android.view.inputmethod.InputConnection r1, @androidx.annotation.NonNull android.view.inputmethod.EditorInfo r2) {
            androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener r0 = createOnCommitContentListenerUsingPerformReceiveContent(r0)
            android.view.inputmethod.InputConnection r0 = createWrapper(r1, r2, r0)
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static android.view.inputmethod.InputConnection createWrapper(@androidx.annotation.NonNull android.view.inputmethod.InputConnection r3, @androidx.annotation.NonNull android.view.inputmethod.EditorInfo r4, @androidx.annotation.NonNull androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener r5) {
            java.lang.String r0 = "inputConnection must be non-null"
            androidx.core.util.ObjectsCompat.requireNonNull(r3, r0)
            java.lang.String r0 = "editorInfo must be non-null"
            androidx.core.util.ObjectsCompat.requireNonNull(r4, r0)
            java.lang.String r0 = "onCommitContentListener must be non-null"
            androidx.core.util.ObjectsCompat.requireNonNull(r5, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            r2 = 0
            if (r0 < r1) goto L1c
            androidx.core.view.inputmethod.InputConnectionCompat$1 r4 = new androidx.core.view.inputmethod.InputConnectionCompat$1
            r4.<init>(r3, r2, r5)
            return r4
        L1c:
            java.lang.String[] r4 = androidx.core.view.inputmethod.EditorInfoCompat.getContentMimeTypes(r4)
            int r4 = r4.length
            if (r4 != 0) goto L24
            return r3
        L24:
            androidx.core.view.inputmethod.InputConnectionCompat$2 r4 = new androidx.core.view.inputmethod.InputConnectionCompat$2
            r4.<init>(r3, r2, r5)
            return r4
    }

    static boolean handlePerformPrivateCommand(@androidx.annotation.Nullable java.lang.String r7, @androidx.annotation.Nullable android.os.Bundle r8, @androidx.annotation.NonNull androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener r9) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto Le
            r7 = 0
            goto L17
        Le:
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 == 0) goto L82
            r7 = 1
        L17:
            r1 = 0
            if (r7 == 0) goto L20
            java.lang.String r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L22
        L1d:
            r7 = move-exception
            r2 = r1
            goto L7c
        L20:
            java.lang.String r2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L22:
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch: java.lang.Throwable -> L1d
            android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2     // Catch: java.lang.Throwable -> L1d
            if (r7 == 0) goto L2f
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L31
        L2d:
            r7 = move-exception
            goto L7c
        L2f:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L31:
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch: java.lang.Throwable -> L2d
            android.net.Uri r3 = (android.net.Uri) r3     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L3c
            java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L3e
        L3c:
            java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L3e:
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch: java.lang.Throwable -> L2d
            android.content.ClipDescription r4 = (android.content.ClipDescription) r4     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L49
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L4b
        L49:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L4b:
            android.os.Parcelable r5 = r8.getParcelable(r5)     // Catch: java.lang.Throwable -> L2d
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L56
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L58
        L56:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L58:
            int r6 = r8.getInt(r6)     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L61
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L63
        L61:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L63:
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch: java.lang.Throwable -> L2d
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L76
            if (r4 == 0) goto L76
            androidx.core.view.inputmethod.InputContentInfoCompat r8 = new androidx.core.view.inputmethod.InputContentInfoCompat     // Catch: java.lang.Throwable -> L2d
            r8.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r9.onCommitContent(r8, r6, r7)     // Catch: java.lang.Throwable -> L2d
        L76:
            if (r2 == 0) goto L7b
            r2.send(r0, r1)
        L7b:
            return r0
        L7c:
            if (r2 == 0) goto L81
            r2.send(r0, r1)
        L81:
            throw r7
        L82:
            return r0
    }
}
