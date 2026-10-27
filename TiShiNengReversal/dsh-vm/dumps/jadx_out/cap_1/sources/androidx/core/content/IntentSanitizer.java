package androidx.core.content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class IntentSanitizer {
    private static final java.lang.String TAG = "IntentSanitizer";
    private boolean mAllowAnyComponent;
    private boolean mAllowClipDataText;
    private boolean mAllowIdentifier;
    private boolean mAllowSelector;
    private boolean mAllowSourceBounds;
    private androidx.core.util.Predicate<java.lang.String> mAllowedActions;
    private androidx.core.util.Predicate<java.lang.String> mAllowedCategories;
    private androidx.core.util.Predicate<android.content.ClipData> mAllowedClipData;
    private androidx.core.util.Predicate<android.net.Uri> mAllowedClipDataUri;
    private androidx.core.util.Predicate<android.content.ComponentName> mAllowedComponents;
    private androidx.core.util.Predicate<android.net.Uri> mAllowedData;
    private java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> mAllowedExtras;
    private int mAllowedFlags;
    private androidx.core.util.Predicate<java.lang.String> mAllowedPackages;
    private androidx.core.util.Predicate<java.lang.String> mAllowedTypes;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.core.content.IntentSanitizer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getIdentifier(android.content.Intent r0) {
                java.lang.String r0 = r0.getIdentifier()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.content.Intent setIdentifier(android.content.Intent r0, java.lang.String r1) {
                android.content.Intent r0 = r0.setIdentifier(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(31)
    private static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void checkOtherMembers(int r2, android.content.ClipData.Item r3, androidx.core.util.Consumer<java.lang.String> r4) {
                java.lang.String r0 = r3.getHtmlText()
                if (r0 != 0) goto L14
                android.content.Intent r0 = r3.getIntent()
                if (r0 != 0) goto L14
                android.view.textclassifier.TextLinks r0 = r3.getTextLinks()
                if (r0 == 0) goto L13
                goto L14
            L13:
                return
            L14:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ClipData item at position "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r2 = " contains htmlText, textLinks or intent: "
                r0.append(r2)
                r0.append(r3)
                java.lang.String r2 = r0.toString()
                r4.accept(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private static final int HISTORY_STACK_FLAGS = 2112614400;
        private static final int RECEIVER_FLAGS = 2015363072;
        private boolean mAllowAnyComponent;
        private boolean mAllowClipDataText;
        private boolean mAllowIdentifier;
        private boolean mAllowSelector;
        private boolean mAllowSomeComponents;
        private boolean mAllowSourceBounds;
        private androidx.core.util.Predicate<java.lang.String> mAllowedActions;
        private androidx.core.util.Predicate<java.lang.String> mAllowedCategories;
        private androidx.core.util.Predicate<android.content.ClipData> mAllowedClipData;
        private androidx.core.util.Predicate<android.net.Uri> mAllowedClipDataUri;
        private androidx.core.util.Predicate<android.content.ComponentName> mAllowedComponents;
        private androidx.core.util.Predicate<android.net.Uri> mAllowedData;
        private java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> mAllowedExtras;
        private int mAllowedFlags;
        private androidx.core.util.Predicate<java.lang.String> mAllowedPackages;
        private androidx.core.util.Predicate<java.lang.String> mAllowedTypes;

        public Builder() {
                r1 = this;
                r1.<init>()
                androidx.core.content.n r0 = new androidx.core.content.n
                r0.<init>()
                r1.mAllowedActions = r0
                androidx.core.content.o r0 = new androidx.core.content.o
                r0.<init>()
                r1.mAllowedData = r0
                androidx.core.content.p r0 = new androidx.core.content.p
                r0.<init>()
                r1.mAllowedTypes = r0
                androidx.core.content.q r0 = new androidx.core.content.q
                r0.<init>()
                r1.mAllowedCategories = r0
                androidx.core.content.r r0 = new androidx.core.content.r
                r0.<init>()
                r1.mAllowedPackages = r0
                androidx.core.content.s r0 = new androidx.core.content.s
                r0.<init>()
                r1.mAllowedComponents = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mAllowedExtras = r0
                r0 = 0
                r1.mAllowClipDataText = r0
                androidx.core.content.t r0 = new androidx.core.content.t
                r0.<init>()
                r1.mAllowedClipDataUri = r0
                androidx.core.content.u r0 = new androidx.core.content.u
                r0.<init>()
                r1.mAllowedClipData = r0
                return
        }

        public static /* synthetic */ boolean a(android.content.ComponentName r0) {
                r0 = 0
                return r0
        }

        public static /* synthetic */ boolean b(java.lang.String r0) {
                r0 = 0
                return r0
        }

        public static /* synthetic */ boolean c(java.lang.String r0, android.content.ComponentName r1) {
                java.lang.String r1 = r1.getPackageName()
                boolean r0 = r0.equals(r1)
                return r0
        }

        public static /* synthetic */ boolean d(java.lang.String r0, android.net.Uri r1) {
                java.lang.String r1 = r1.getAuthority()
                boolean r0 = r0.equals(r1)
                return r0
        }

        public static /* synthetic */ boolean e(java.lang.Class r1, androidx.core.util.Predicate r2, java.lang.Object r3) {
                boolean r0 = r1.isInstance(r3)
                if (r0 == 0) goto L12
                java.lang.Object r1 = r1.cast(r3)
                boolean r1 = r2.test(r1)
                if (r1 == 0) goto L12
                r1 = 1
                return r1
            L12:
                r1 = 0
                return r1
        }

        public static /* synthetic */ boolean f(java.lang.String r0) {
                r0 = 0
                return r0
        }

        public static /* synthetic */ boolean g(java.lang.String r0, android.net.Uri r1) {
                java.lang.String r1 = r1.getAuthority()
                boolean r0 = r0.equals(r1)
                return r0
        }

        public static /* synthetic */ boolean h(java.lang.String r0, android.net.Uri r1) {
                java.lang.String r1 = r1.getAuthority()
                boolean r0 = r0.equals(r1)
                return r0
        }

        public static /* synthetic */ boolean i(java.lang.Object r0) {
                r0 = 0
                return r0
        }

        public static /* synthetic */ boolean j(android.content.ComponentName r0) {
                r0 = 1
                return r0
        }

        public static /* synthetic */ boolean k(java.lang.String r0) {
                r0 = 0
                return r0
        }

        public static /* synthetic */ boolean l(android.net.Uri r0) {
                r0 = 0
                return r0
        }

        public static /* synthetic */ boolean m(android.net.Uri r0) {
                r0 = 0
                return r0
        }

        public static /* synthetic */ boolean n(java.lang.String r0, android.net.Uri r1) {
                java.lang.String r1 = r1.getAuthority()
                boolean r0 = r0.equals(r1)
                return r0
        }

        public static /* synthetic */ boolean o(java.lang.Object r0) {
                r0 = 1
                return r0
        }

        public static /* synthetic */ boolean p(java.lang.String r0) {
                r0 = 0
                return r0
        }

        public static /* synthetic */ boolean q(android.content.ClipData r0) {
                r0 = 0
                return r0
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowAction(@androidx.annotation.NonNull androidx.core.util.Predicate<java.lang.String> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<java.lang.String> r0 = r1.mAllowedActions
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedActions = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowAction(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                java.util.Objects.requireNonNull(r2)
                androidx.core.content.e r0 = new androidx.core.content.e
                r0.<init>(r2)
                r1.allowAction(r0)
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowAnyComponent() {
                r1 = this;
                r0 = 1
                r1.mAllowAnyComponent = r0
                androidx.core.content.j r0 = new androidx.core.content.j
                r0.<init>()
                r1.mAllowedComponents = r0
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowCategory(@androidx.annotation.NonNull androidx.core.util.Predicate<java.lang.String> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<java.lang.String> r0 = r1.mAllowedCategories
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedCategories = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowCategory(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                java.util.Objects.requireNonNull(r2)
                androidx.core.content.e r0 = new androidx.core.content.e
                r0.<init>(r2)
                androidx.core.content.IntentSanitizer$Builder r2 = r1.allowCategory(r0)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowClipData(@androidx.annotation.NonNull androidx.core.util.Predicate<android.content.ClipData> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<android.content.ClipData> r0 = r1.mAllowedClipData
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedClipData = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowClipDataText() {
                r1 = this;
                r0 = 1
                r1.mAllowClipDataText = r0
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowClipDataUri(@androidx.annotation.NonNull androidx.core.util.Predicate<android.net.Uri> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<android.net.Uri> r0 = r1.mAllowedClipDataUri
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedClipDataUri = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowClipDataUriWithAuthority(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.content.k r0 = new androidx.core.content.k
                r0.<init>(r2)
                androidx.core.content.IntentSanitizer$Builder r2 = r1.allowClipDataUri(r0)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowComponent(@androidx.annotation.NonNull android.content.ComponentName r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                java.util.Objects.requireNonNull(r2)
                androidx.core.content.i r0 = new androidx.core.content.i
                r0.<init>(r2)
                androidx.core.content.IntentSanitizer$Builder r2 = r1.allowComponent(r0)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowComponent(@androidx.annotation.NonNull androidx.core.util.Predicate<android.content.ComponentName> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                r0 = 1
                r1.mAllowSomeComponents = r0
                androidx.core.util.Predicate<android.content.ComponentName> r0 = r1.mAllowedComponents
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedComponents = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowComponentWithPackage(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.content.f r0 = new androidx.core.content.f
                r0.<init>(r2)
                androidx.core.content.IntentSanitizer$Builder r2 = r1.allowComponent(r0)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowData(@androidx.annotation.NonNull androidx.core.util.Predicate<android.net.Uri> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<android.net.Uri> r0 = r1.mAllowedData
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedData = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowDataWithAuthority(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.content.g r0 = new androidx.core.content.g
                r0.<init>(r2)
                r1.allowData(r0)
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowExtra(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull androidx.core.util.Predicate<java.lang.Object> r3) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Preconditions.checkNotNull(r3)
                java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> r0 = r1.mAllowedExtras
                java.lang.Object r0 = r0.get(r2)
                androidx.core.util.Predicate r0 = (androidx.core.util.Predicate) r0
                if (r0 != 0) goto L15
                androidx.core.content.l r0 = new androidx.core.content.l
                r0.<init>()
            L15:
                androidx.core.util.Predicate r3 = r0.or(r3)
                java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> r0 = r1.mAllowedExtras
                r0.put(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowExtra(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Class<?> r3) {
                r1 = this;
                androidx.core.content.v r0 = new androidx.core.content.v
                r0.<init>()
                androidx.core.content.IntentSanitizer$Builder r2 = r1.allowExtra(r2, r3, r0)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public <T> androidx.core.content.IntentSanitizer.Builder allowExtra(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Class<T> r3, @androidx.annotation.NonNull androidx.core.util.Predicate<T> r4) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Preconditions.checkNotNull(r3)
                androidx.core.util.Preconditions.checkNotNull(r4)
                androidx.core.content.h r0 = new androidx.core.content.h
                r0.<init>(r3, r4)
                androidx.core.content.IntentSanitizer$Builder r2 = r1.allowExtra(r2, r0)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowExtraOutput(@androidx.annotation.NonNull androidx.core.util.Predicate<android.net.Uri> r3) {
                r2 = this;
                java.lang.String r0 = "output"
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                r2.allowExtra(r0, r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowExtraOutput(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                androidx.core.content.d r0 = new androidx.core.content.d
                r0.<init>(r3)
                java.lang.String r3 = "output"
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                r2.allowExtra(r3, r1, r0)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowExtraStream(@androidx.annotation.NonNull androidx.core.util.Predicate<android.net.Uri> r3) {
                r2 = this;
                java.lang.String r0 = "android.intent.extra.STREAM"
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                r2.allowExtra(r0, r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowExtraStreamUriWithAuthority(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                androidx.core.util.Preconditions.checkNotNull(r3)
                androidx.core.content.m r0 = new androidx.core.content.m
                r0.<init>(r3)
                java.lang.String r3 = "android.intent.extra.STREAM"
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                r2.allowExtra(r3, r1, r0)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowFlags(int r2) {
                r1 = this;
                int r0 = r1.mAllowedFlags
                r2 = r2 | r0
                r1.mAllowedFlags = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowHistoryStackFlags() {
                r2 = this;
                int r0 = r2.mAllowedFlags
                r1 = 2112614400(0x7debf000, float:3.9201841E37)
                r0 = r0 | r1
                r2.mAllowedFlags = r0
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowIdentifier() {
                r1 = this;
                r0 = 1
                r1.mAllowIdentifier = r0
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowPackage(@androidx.annotation.NonNull androidx.core.util.Predicate<java.lang.String> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<java.lang.String> r0 = r1.mAllowedPackages
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedPackages = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowPackage(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                java.util.Objects.requireNonNull(r2)
                androidx.core.content.e r0 = new androidx.core.content.e
                r0.<init>(r2)
                androidx.core.content.IntentSanitizer$Builder r2 = r1.allowPackage(r0)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowReceiverFlags() {
                r2 = this;
                int r0 = r2.mAllowedFlags
                r1 = 2015363072(0x78200000, float:1.2980742E34)
                r0 = r0 | r1
                r2.mAllowedFlags = r0
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowSelector() {
                r1 = this;
                r0 = 1
                r1.mAllowSelector = r0
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowSourceBounds() {
                r1 = this;
                r0 = 1
                r1.mAllowSourceBounds = r0
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowType(@androidx.annotation.NonNull androidx.core.util.Predicate<java.lang.String> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<java.lang.String> r0 = r1.mAllowedTypes
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedTypes = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowType(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                java.util.Objects.requireNonNull(r2)
                androidx.core.content.e r0 = new androidx.core.content.e
                r0.<init>(r2)
                androidx.core.content.IntentSanitizer$Builder r2 = r1.allowType(r0)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.core.content.IntentSanitizer build() {
                r2 = this;
                boolean r0 = r2.mAllowAnyComponent
                if (r0 == 0) goto L8
                boolean r1 = r2.mAllowSomeComponents
                if (r1 != 0) goto Lf
            L8:
                if (r0 != 0) goto L17
                boolean r0 = r2.mAllowSomeComponents
                if (r0 == 0) goto Lf
                goto L17
            Lf:
                java.lang.SecurityException r0 = new java.lang.SecurityException
                java.lang.String r1 = "You must call either allowAnyComponent or one or more of the allowComponent methods; but not both."
                r0.<init>(r1)
                throw r0
            L17:
                androidx.core.content.IntentSanitizer r0 = new androidx.core.content.IntentSanitizer
                r1 = 0
                r0.<init>(r1)
                int r1 = r2.mAllowedFlags
                androidx.core.content.IntentSanitizer.access$102(r0, r1)
                androidx.core.util.Predicate<java.lang.String> r1 = r2.mAllowedActions
                androidx.core.content.IntentSanitizer.access$202(r0, r1)
                androidx.core.util.Predicate<android.net.Uri> r1 = r2.mAllowedData
                androidx.core.content.IntentSanitizer.access$302(r0, r1)
                androidx.core.util.Predicate<java.lang.String> r1 = r2.mAllowedTypes
                androidx.core.content.IntentSanitizer.access$402(r0, r1)
                androidx.core.util.Predicate<java.lang.String> r1 = r2.mAllowedCategories
                androidx.core.content.IntentSanitizer.access$502(r0, r1)
                androidx.core.util.Predicate<java.lang.String> r1 = r2.mAllowedPackages
                androidx.core.content.IntentSanitizer.access$602(r0, r1)
                boolean r1 = r2.mAllowAnyComponent
                androidx.core.content.IntentSanitizer.access$702(r0, r1)
                androidx.core.util.Predicate<android.content.ComponentName> r1 = r2.mAllowedComponents
                androidx.core.content.IntentSanitizer.access$802(r0, r1)
                java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> r1 = r2.mAllowedExtras
                androidx.core.content.IntentSanitizer.access$902(r0, r1)
                boolean r1 = r2.mAllowClipDataText
                androidx.core.content.IntentSanitizer.access$1002(r0, r1)
                androidx.core.util.Predicate<android.net.Uri> r1 = r2.mAllowedClipDataUri
                androidx.core.content.IntentSanitizer.access$1102(r0, r1)
                androidx.core.util.Predicate<android.content.ClipData> r1 = r2.mAllowedClipData
                androidx.core.content.IntentSanitizer.access$1202(r0, r1)
                boolean r1 = r2.mAllowIdentifier
                androidx.core.content.IntentSanitizer.access$1302(r0, r1)
                boolean r1 = r2.mAllowSelector
                androidx.core.content.IntentSanitizer.access$1402(r0, r1)
                boolean r1 = r2.mAllowSourceBounds
                androidx.core.content.IntentSanitizer.access$1502(r0, r1)
                return r0
        }
    }

    private IntentSanitizer() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ IntentSanitizer(androidx.core.content.IntentSanitizer.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(java.lang.String r1) {
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
    }

    static /* synthetic */ boolean access$1002(androidx.core.content.IntentSanitizer r0, boolean r1) {
            r0.mAllowClipDataText = r1
            return r1
    }

    static /* synthetic */ int access$102(androidx.core.content.IntentSanitizer r0, int r1) {
            r0.mAllowedFlags = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$1102(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedClipDataUri = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$1202(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedClipData = r1
            return r1
    }

    static /* synthetic */ boolean access$1302(androidx.core.content.IntentSanitizer r0, boolean r1) {
            r0.mAllowIdentifier = r1
            return r1
    }

    static /* synthetic */ boolean access$1402(androidx.core.content.IntentSanitizer r0, boolean r1) {
            r0.mAllowSelector = r1
            return r1
    }

    static /* synthetic */ boolean access$1502(androidx.core.content.IntentSanitizer r0, boolean r1) {
            r0.mAllowSourceBounds = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$202(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedActions = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$302(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedData = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$402(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedTypes = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$502(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedCategories = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$602(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedPackages = r1
            return r1
    }

    static /* synthetic */ boolean access$702(androidx.core.content.IntentSanitizer r0, boolean r1) {
            r0.mAllowAnyComponent = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$802(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedComponents = r1
            return r1
    }

    static /* synthetic */ java.util.Map access$902(androidx.core.content.IntentSanitizer r0, java.util.Map r1) {
            r0.mAllowedExtras = r1
            return r1
    }

    public static /* synthetic */ void b(java.lang.String r0) {
            return
    }

    private static void checkOtherMembers(int r2, android.content.ClipData.Item r3, androidx.core.util.Consumer<java.lang.String> r4) {
            java.lang.String r0 = r3.getHtmlText()
            if (r0 != 0) goto Le
            android.content.Intent r0 = r3.getIntent()
            if (r0 == 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ClipData item at position "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " contains htmlText, textLinks or intent: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            r4.accept(r2)
            return
    }

    private void putExtra(android.content.Intent r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            if (r4 != 0) goto Lb
            android.os.Bundle r2 = r2.getExtras()
            r4 = 0
            r2.putString(r3, r4)
            return
        Lb:
            boolean r0 = r4 instanceof android.os.Parcelable
            if (r0 == 0) goto L15
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r2.putExtra(r3, r4)
            return
        L15:
            boolean r0 = r4 instanceof android.os.Parcelable[]
            if (r0 == 0) goto L1f
            android.os.Parcelable[] r4 = (android.os.Parcelable[]) r4
            r2.putExtra(r3, r4)
            return
        L1f:
            boolean r0 = r4 instanceof java.io.Serializable
            if (r0 == 0) goto L29
            java.io.Serializable r4 = (java.io.Serializable) r4
            r2.putExtra(r3, r4)
            return
        L29:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Unsupported type "
            r3.append(r0)
            java.lang.Class r4 = r4.getClass()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    static void sanitizeClipData(@androidx.annotation.NonNull android.content.Intent r7, android.content.Intent r8, androidx.core.util.Predicate<android.content.ClipData> r9, boolean r10, androidx.core.util.Predicate<android.net.Uri> r11, androidx.core.util.Consumer<java.lang.String> r12) {
            android.content.ClipData r7 = r7.getClipData()
            if (r7 != 0) goto L8
            goto Lde
        L8:
            if (r9 == 0) goto L14
            boolean r9 = r9.test(r7)
            if (r9 == 0) goto L14
            r8.setClipData(r7)
            return
        L14:
            r9 = 0
            r0 = 0
            r1 = r9
        L17:
            int r2 = r7.getItemCount()
            if (r0 >= r2) goto Ld9
            android.content.ClipData$Item r2 = r7.getItemAt(r0)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L2b
            androidx.core.content.IntentSanitizer.Api31Impl.checkOtherMembers(r0, r2, r12)
            goto L2e
        L2b:
            checkOtherMembers(r0, r2, r12)
        L2e:
            if (r10 == 0) goto L35
            java.lang.CharSequence r3 = r2.getText()
            goto L5c
        L35:
            java.lang.CharSequence r3 = r2.getText()
            if (r3 == 0) goto L5b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Item text cannot contain value. Item position: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ". Text: "
            r3.append(r4)
            java.lang.CharSequence r4 = r2.getText()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r12.accept(r3)
        L5b:
            r3 = r9
        L5c:
            java.lang.String r4 = ". URI: "
            java.lang.String r5 = "Item URI is not allowed. Item position: "
            if (r11 != 0) goto L85
            android.net.Uri r6 = r2.getUri()
            if (r6 == 0) goto Lb2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r0)
            r6.append(r4)
            android.net.Uri r2 = r2.getUri()
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r12.accept(r2)
            goto Lb2
        L85:
            android.net.Uri r6 = r2.getUri()
            if (r6 == 0) goto Lb4
            android.net.Uri r6 = r2.getUri()
            boolean r6 = r11.test(r6)
            if (r6 == 0) goto L96
            goto Lb4
        L96:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r0)
            r6.append(r4)
            android.net.Uri r2 = r2.getUri()
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r12.accept(r2)
        Lb2:
            r2 = r9
            goto Lb8
        Lb4:
            android.net.Uri r2 = r2.getUri()
        Lb8:
            if (r3 != 0) goto Lbc
            if (r2 == 0) goto Ld5
        Lbc:
            if (r1 != 0) goto Lcd
            android.content.ClipData r1 = new android.content.ClipData
            android.content.ClipDescription r4 = r7.getDescription()
            android.content.ClipData$Item r5 = new android.content.ClipData$Item
            r5.<init>(r3, r9, r2)
            r1.<init>(r4, r5)
            goto Ld5
        Lcd:
            android.content.ClipData$Item r4 = new android.content.ClipData$Item
            r4.<init>(r3, r9, r2)
            r1.addItem(r4)
        Ld5:
            int r0 = r0 + 1
            goto L17
        Ld9:
            if (r1 == 0) goto Lde
            r8.setClipData(r1)
        Lde:
            return
    }

    @androidx.annotation.NonNull
    public android.content.Intent sanitize(@androidx.annotation.NonNull android.content.Intent r8, @androidx.annotation.NonNull androidx.core.util.Consumer<java.lang.String> r9) {
            r7 = this;
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.ComponentName r0 = r8.getComponent()
            boolean r2 = r7.mAllowAnyComponent
            if (r2 == 0) goto Lf
            if (r0 == 0) goto L17
        Lf:
            androidx.core.util.Predicate<android.content.ComponentName> r2 = r7.mAllowedComponents
            boolean r2 = r2.test(r0)
            if (r2 == 0) goto L1b
        L17:
            r1.setComponent(r0)
            goto L3b
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Component is not allowed: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r9.accept(r0)
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r2 = "android"
            java.lang.String r3 = "java.lang.Void"
            r0.<init>(r2, r3)
            r1.setComponent(r0)
        L3b:
            java.lang.String r0 = r8.getPackage()
            if (r0 == 0) goto L5f
            androidx.core.util.Predicate<java.lang.String> r2 = r7.mAllowedPackages
            boolean r2 = r2.test(r0)
            if (r2 == 0) goto L4a
            goto L5f
        L4a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Package is not allowed: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r9.accept(r0)
            goto L62
        L5f:
            r1.setPackage(r0)
        L62:
            int r0 = r7.mAllowedFlags
            int r2 = r8.getFlags()
            r0 = r0 | r2
            int r2 = r7.mAllowedFlags
            if (r0 != r2) goto L75
            int r0 = r8.getFlags()
            r1.setFlags(r0)
            goto L9d
        L75:
            int r0 = r8.getFlags()
            r0 = r0 & r2
            r1.setFlags(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "The intent contains flags that are not allowed: 0x"
            r0.append(r2)
            int r2 = r8.getFlags()
            int r3 = r7.mAllowedFlags
            int r3 = ~r3
            r2 = r2 & r3
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r9.accept(r0)
        L9d:
            java.lang.String r0 = r8.getAction()
            if (r0 == 0) goto Lc1
            androidx.core.util.Predicate<java.lang.String> r2 = r7.mAllowedActions
            boolean r2 = r2.test(r0)
            if (r2 == 0) goto Lac
            goto Lc1
        Lac:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Action is not allowed: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r9.accept(r0)
            goto Lc4
        Lc1:
            r1.setAction(r0)
        Lc4:
            android.net.Uri r0 = r8.getData()
            if (r0 == 0) goto Le8
            androidx.core.util.Predicate<android.net.Uri> r2 = r7.mAllowedData
            boolean r2 = r2.test(r0)
            if (r2 == 0) goto Ld3
            goto Le8
        Ld3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Data is not allowed: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r9.accept(r0)
            goto Leb
        Le8:
            r1.setData(r0)
        Leb:
            java.lang.String r0 = r8.getType()
            if (r0 == 0) goto L10f
            androidx.core.util.Predicate<java.lang.String> r2 = r7.mAllowedTypes
            boolean r2 = r2.test(r0)
            if (r2 == 0) goto Lfa
            goto L10f
        Lfa:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Type is not allowed: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r9.accept(r0)
            goto L116
        L10f:
            android.net.Uri r2 = r1.getData()
            r1.setDataAndType(r2, r0)
        L116:
            java.util.Set r0 = r8.getCategories()
            if (r0 == 0) goto L14d
            java.util.Iterator r0 = r0.iterator()
        L120:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L14d
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.core.util.Predicate<java.lang.String> r3 = r7.mAllowedCategories
            boolean r3 = r3.test(r2)
            if (r3 == 0) goto L138
            r1.addCategory(r2)
            goto L120
        L138:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Category is not allowed: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r9.accept(r2)
            goto L120
        L14d:
            android.os.Bundle r0 = r8.getExtras()
            if (r0 == 0) goto L1c5
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L15b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1c5
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "android.intent.extra.STREAM"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L17b
            int r4 = r7.mAllowedFlags
            r4 = r4 & 1
            if (r4 != 0) goto L17b
            java.lang.String r3 = "Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag."
            r9.accept(r3)
            goto L15b
        L17b:
            java.lang.String r4 = "output"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L190
            int r4 = r7.mAllowedFlags
            int r4 = ~r4
            r4 = r4 & 3
            if (r4 == 0) goto L190
            java.lang.String r3 = "Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags."
            r9.accept(r3)
            goto L15b
        L190:
            java.lang.Object r4 = r0.get(r3)
            java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> r5 = r7.mAllowedExtras
            java.lang.Object r5 = r5.get(r3)
            androidx.core.util.Predicate r5 = (androidx.core.util.Predicate) r5
            if (r5 == 0) goto L1a8
            boolean r5 = r5.test(r4)
            if (r5 == 0) goto L1a8
            r7.putExtra(r1, r3, r4)
            goto L15b
        L1a8:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Extra is not allowed. Key: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = ". Value: "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            r9.accept(r3)
            goto L15b
        L1c5:
            androidx.core.util.Predicate<android.content.ClipData> r2 = r7.mAllowedClipData
            boolean r3 = r7.mAllowClipDataText
            androidx.core.util.Predicate<android.net.Uri> r4 = r7.mAllowedClipDataUri
            r0 = r8
            r5 = r9
            sanitizeClipData(r0, r1, r2, r3, r4, r5)
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r8 < r9) goto L200
            boolean r8 = r7.mAllowIdentifier
            if (r8 == 0) goto L1e2
            java.lang.String r8 = androidx.core.content.IntentSanitizer.Api29Impl.getIdentifier(r0)
            androidx.core.content.IntentSanitizer.Api29Impl.setIdentifier(r1, r8)
            goto L200
        L1e2:
            java.lang.String r8 = androidx.core.content.IntentSanitizer.Api29Impl.getIdentifier(r0)
            if (r8 == 0) goto L200
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Identifier is not allowed: "
            r8.append(r9)
            java.lang.String r9 = androidx.core.content.IntentSanitizer.Api29Impl.getIdentifier(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r5.accept(r8)
        L200:
            boolean r8 = r7.mAllowSelector
            if (r8 == 0) goto L20c
            android.content.Intent r8 = r0.getSelector()
            r1.setSelector(r8)
            goto L22a
        L20c:
            android.content.Intent r8 = r0.getSelector()
            if (r8 == 0) goto L22a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Selector is not allowed: "
            r8.append(r9)
            android.content.Intent r9 = r0.getSelector()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r5.accept(r8)
        L22a:
            boolean r8 = r7.mAllowSourceBounds
            if (r8 == 0) goto L236
            android.graphics.Rect r8 = r0.getSourceBounds()
            r1.setSourceBounds(r8)
            return r1
        L236:
            android.graphics.Rect r8 = r0.getSourceBounds()
            if (r8 == 0) goto L254
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "SourceBounds is not allowed: "
            r8.append(r9)
            android.graphics.Rect r9 = r0.getSourceBounds()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r5.accept(r8)
        L254:
            return r1
    }

    @androidx.annotation.NonNull
    public android.content.Intent sanitizeByFiltering(@androidx.annotation.NonNull android.content.Intent r2) {
            r1 = this;
            androidx.core.content.c r0 = new androidx.core.content.c
            r0.<init>()
            android.content.Intent r2 = r1.sanitize(r2, r0)
            return r2
    }

    @androidx.annotation.NonNull
    public android.content.Intent sanitizeByThrowing(@androidx.annotation.NonNull android.content.Intent r2) {
            r1 = this;
            androidx.core.content.b r0 = new androidx.core.content.b
            r0.<init>()
            android.content.Intent r2 = r1.sanitize(r2, r0)
            return r2
    }
}
