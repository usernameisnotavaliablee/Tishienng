package androidx.activity.result.contract;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ActivityResultContracts {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CaptureVideo extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, java.lang.Boolean> {
        public CaptureVideo() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.CallSuper
        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.media.action.VIDEO_CAPTURE"
                r2.<init>(r0)
                java.lang.String r0 = "output"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)"
                kotlin.jvm.internal.g0.o(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.NotNull
        public final java.lang.Boolean parseResult(int r1, @org.jetbrains.annotations.Nullable android.content.Intent r2) {
                r0 = this;
                r2 = -1
                if (r1 != r2) goto L5
                r1 = 1
                goto L6
            L5:
                r1 = 0
            L6:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.lang.Boolean parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.lang.Boolean r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(19)
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$CreateDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class CreateDocument extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, android.net.Uri> {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String mimeType;

        @kotlin.Deprecated(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @kotlin.ReplaceWith(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public CreateDocument() {
                r1 = this;
                java.lang.String r0 = "*/*"
                r1.<init>(r0)
                return
        }

        public CreateDocument(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "mimeType"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.mimeType = r2
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        @androidx.annotation.CallSuper
        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.CREATE_DOCUMENT"
                r2.<init>(r0)
                java.lang.String r0 = r1.mimeType
                android.content.Intent r2 = r2.setType(r0)
                java.lang.String r0 = "android.intent.extra.TITLE"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)"
                kotlin.jvm.internal.g0.o(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                r2 = 0
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.Nullable
        public final android.net.Uri parseResult(int r3, @org.jetbrains.annotations.Nullable android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto Ld
                android.net.Uri r3 = r4.getData()
                return r3
            Ld:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class GetContent extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, android.net.Uri> {
        public GetContent() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        @androidx.annotation.CallSuper
        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.GET_CONTENT"
                r2.<init>(r0)
                java.lang.String r0 = "android.intent.category.OPENABLE"
                android.content.Intent r2 = r2.addCategory(r0)
                android.content.Intent r2 = r2.setType(r3)
                java.lang.String r3 = "Intent(Intent.ACTION_GET…          .setType(input)"
                kotlin.jvm.internal.g0.o(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                r2 = 0
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.Nullable
        public final android.net.Uri parseResult(int r3, @org.jetbrains.annotations.Nullable android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto Ld
                android.net.Uri r3 = r4.getData()
                return r3
            Ld:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(18)
    public static class GetMultipleContents extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, java.util.List<android.net.Uri>> {

        @org.jetbrains.annotations.NotNull
        public static final androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion Companion = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @androidx.annotation.RequiresApi(18)
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

            @org.jetbrains.annotations.NotNull
            public final java.util.List<android.net.Uri> getClipDataUris$activity_release(@org.jetbrains.annotations.NotNull android.content.Intent r5) {
                    r4 = this;
                    java.lang.String r0 = "<this>"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                    r0.<init>()
                    android.net.Uri r1 = r5.getData()
                    if (r1 == 0) goto L13
                    r0.add(r1)
                L13:
                    android.content.ClipData r5 = r5.getClipData()
                    if (r5 != 0) goto L24
                    boolean r1 = r0.isEmpty()
                    if (r1 == 0) goto L24
                    java.util.List r5 = kotlin.collections.f0.J()
                    return r5
                L24:
                    if (r5 == 0) goto L3d
                    int r1 = r5.getItemCount()
                    r2 = 0
                L2b:
                    if (r2 >= r1) goto L3d
                    android.content.ClipData$Item r3 = r5.getItemAt(r2)
                    android.net.Uri r3 = r3.getUri()
                    if (r3 == 0) goto L3a
                    r0.add(r3)
                L3a:
                    int r2 = r2 + 1
                    goto L2b
                L3d:
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>(r0)
                    return r5
            }
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion = r0
                return
        }

        public GetMultipleContents() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        @androidx.annotation.CallSuper
        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.GET_CONTENT"
                r2.<init>(r0)
                java.lang.String r0 = "android.intent.category.OPENABLE"
                android.content.Intent r2 = r2.addCategory(r0)
                android.content.Intent r2 = r2.setType(r3)
                java.lang.String r3 = "android.intent.extra.ALLOW_MULTIPLE"
                r0 = 1
                android.content.Intent r2 = r2.putExtra(r3, r0)
                java.lang.String r3 = "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)"
                kotlin.jvm.internal.g0.o(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.util.List<android.net.Uri> parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.util.List r1 = r0.parseResult2(r1, r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.NotNull
        /* renamed from: parseResult, reason: avoid collision after fix types in other method */
        public final java.util.List<android.net.Uri> parseResult2(int r2, @org.jetbrains.annotations.Nullable android.content.Intent r3) {
                r1 = this;
                r0 = -1
                if (r2 != r0) goto L4
                goto L5
            L4:
                r3 = 0
            L5:
                if (r3 == 0) goto L10
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r2 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion
                java.util.List r2 = r2.getClipDataUris$activity_release(r3)
                if (r2 == 0) goto L10
                return r2
            L10:
                java.util.List r2 = kotlin.collections.f0.J()
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(19)
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class OpenDocument extends androidx.activity.result.contract.ActivityResultContract<java.lang.String[], android.net.Uri> {
        public OpenDocument() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        @androidx.annotation.CallSuper
        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String[] r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
                r2.<init>(r0)
                java.lang.String r0 = "android.intent.extra.MIME_TYPES"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "*/*"
                android.content.Intent r2 = r2.setType(r3)
                java.lang.String r3 = "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")"
                kotlin.jvm.internal.g0.o(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String[] r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                r2 = 0
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.Nullable
        public final android.net.Uri parseResult(int r3, @org.jetbrains.annotations.Nullable android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto Ld
                android.net.Uri r3 = r4.getData()
                return r3
            Ld:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class OpenDocumentTree extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, android.net.Uri> {
        public OpenDocumentTree() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.CallSuper
        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r3, @org.jetbrains.annotations.Nullable android.net.Uri r4) {
                r2 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r3, r0)
                android.content.Intent r3 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT_TREE"
                r3.<init>(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 < r1) goto L19
                if (r4 == 0) goto L19
                java.lang.String r0 = "android.provider.extra.INITIAL_URI"
                r3.putExtra(r0, r4)
            L19:
                return r3
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(@org.jetbrains.annotations.NotNull android.content.Context r1, @org.jetbrains.annotations.Nullable android.net.Uri r2) {
                r0 = this;
                java.lang.String r2 = "context"
                kotlin.jvm.internal.g0.p(r1, r2)
                r1 = 0
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.Nullable
        public final android.net.Uri parseResult(int r3, @org.jetbrains.annotations.Nullable android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto Ld
                android.net.Uri r3 = r4.getData()
                return r3
            Ld:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(19)
    public static class OpenMultipleDocuments extends androidx.activity.result.contract.ActivityResultContract<java.lang.String[], java.util.List<android.net.Uri>> {
        public OpenMultipleDocuments() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        @androidx.annotation.CallSuper
        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String[] r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
                r2.<init>(r0)
                java.lang.String r0 = "android.intent.extra.MIME_TYPES"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "android.intent.extra.ALLOW_MULTIPLE"
                r0 = 1
                android.content.Intent r2 = r2.putExtra(r3, r0)
                java.lang.String r3 = "*/*"
                android.content.Intent r2 = r2.setType(r3)
                java.lang.String r3 = "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")"
                kotlin.jvm.internal.g0.o(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String[] r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.util.List<android.net.Uri> parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.util.List r1 = r0.parseResult2(r1, r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.NotNull
        /* renamed from: parseResult, reason: avoid collision after fix types in other method */
        public final java.util.List<android.net.Uri> parseResult2(int r2, @org.jetbrains.annotations.Nullable android.content.Intent r3) {
                r1 = this;
                r0 = -1
                if (r2 != r0) goto L4
                goto L5
            L4:
                r3 = 0
            L5:
                if (r3 == 0) goto L10
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r2 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion
                java.util.List r2 = r2.getClipDataUris$activity_release(r3)
                if (r2 == 0) goto L10
                return r2
            L10:
                java.util.List r2 = kotlin.collections.f0.J()
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickContact\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static final class PickContact extends androidx.activity.result.contract.ActivityResultContract<java.lang.Void, android.net.Uri> {
        public PickContact() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.Void r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r1, @org.jetbrains.annotations.Nullable java.lang.Void r2) {
                r0 = this;
                java.lang.String r2 = "context"
                kotlin.jvm.internal.g0.p(r1, r2)
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "android.intent.action.PICK"
                r1.<init>(r2)
                java.lang.String r2 = "vnd.android.cursor.dir/contact"
                android.content.Intent r1 = r1.setType(r2)
                java.lang.String r2 = "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)"
                kotlin.jvm.internal.g0.o(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.Nullable
        public android.net.Uri parseResult(int r3, @org.jetbrains.annotations.Nullable android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto Ld
                android.net.Uri r3 = r4.getData()
                return r3
            Ld:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(19)
    public static class PickMultipleVisualMedia extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.PickVisualMediaRequest, java.util.List<android.net.Uri>> {

        @org.jetbrains.annotations.NotNull
        public static final androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion Companion = null;
        private final int maxItems;

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

            @android.annotation.SuppressLint({"NewApi", "ClassVerificationFailure"})
            public final int getMaxItems$activity_release() {
                    r1 = this;
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                    boolean r0 = r0.isSystemPickerAvailable$activity_release()
                    if (r0 == 0) goto Ld
                    int r0 = a.a.a()
                    return r0
                Ld:
                    r0 = 2147483647(0x7fffffff, float:NaN)
                    return r0
            }
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion = r0
                return
        }

        public PickMultipleVisualMedia() {
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r1)
                return
        }

        public PickMultipleVisualMedia(int r2) {
                r1 = this;
                r1.<init>()
                r1.maxItems = r2
                r0 = 1
                if (r2 <= r0) goto L9
                return
            L9:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Max items must be higher than 1"
                r2.<init>(r0)
                throw r2
        }

        public /* synthetic */ PickMultipleVisualMedia(int r1, int r2, kotlin.jvm.internal.v r3) {
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto La
                androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion r1 = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion
                int r1 = r1.getMaxItems$activity_release()
            La:
                r0.<init>(r1)
                return
        }

        @android.annotation.SuppressLint({"NewApi", "ClassVerificationFailure"})
        @androidx.annotation.CallSuper
        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r5, @org.jetbrains.annotations.NotNull androidx.activity.result.PickVisualMediaRequest r6) {
                r4 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.g0.p(r6, r0)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r1 = r0.isSystemPickerAvailable$activity_release()
                if (r1 == 0) goto L3c
                android.content.Intent r5 = new android.content.Intent
                java.lang.String r1 = "android.provider.action.PICK_IMAGES"
                r5.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r6 = r6.getMediaType()
                java.lang.String r6 = r0.getVisualMimeType$activity_release(r6)
                r5.setType(r6)
                int r6 = r4.maxItems
                int r0 = a.a.a()
                if (r6 > r0) goto L34
                java.lang.String r6 = "android.provider.extra.PICK_IMAGES_MAX"
                int r0 = r4.maxItems
                r5.putExtra(r6, r0)
                return r5
            L34:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "Max items must be less or equals MediaStore.getPickImagesMaxLimit()"
                r5.<init>(r6)
                throw r5
            L3c:
                boolean r1 = r0.isSystemFallbackPickerAvailable$activity_release(r5)
                java.lang.String r2 = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX"
                java.lang.String r3 = "Required value was null."
                if (r1 == 0) goto L75
                android.content.pm.ResolveInfo r5 = r0.getSystemFallbackPicker$activity_release(r5)
                if (r5 == 0) goto L6f
                android.content.pm.ActivityInfo r5 = r5.activityInfo
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r3 = "androidx.activity.result.contract.action.PICK_IMAGES"
                r1.<init>(r3)
                android.content.pm.ApplicationInfo r3 = r5.applicationInfo
                java.lang.String r3 = r3.packageName
                java.lang.String r5 = r5.name
                r1.setClassName(r3, r5)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r5 = r6.getMediaType()
                java.lang.String r5 = r0.getVisualMimeType$activity_release(r5)
                r1.setType(r5)
                int r5 = r4.maxItems
                r1.putExtra(r2, r5)
                return r1
            L6f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r5.<init>(r3)
                throw r5
            L75:
                boolean r1 = r0.isGmsPickerAvailable$activity_release(r5)
                if (r1 == 0) goto L9f
                android.content.pm.ResolveInfo r5 = r0.getGmsPicker$activity_release(r5)
                if (r5 == 0) goto L99
                android.content.pm.ActivityInfo r5 = r5.activityInfo
                android.content.Intent r6 = new android.content.Intent
                java.lang.String r0 = "com.google.android.gms.provider.action.PICK_IMAGES"
                r6.<init>(r0)
                android.content.pm.ApplicationInfo r0 = r5.applicationInfo
                java.lang.String r0 = r0.packageName
                java.lang.String r5 = r5.name
                r6.setClassName(r0, r5)
                int r5 = r4.maxItems
                r6.putExtra(r2, r5)
                return r6
            L99:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r5.<init>(r3)
                throw r5
            L9f:
                android.content.Intent r5 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
                r5.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r6 = r6.getMediaType()
                java.lang.String r6 = r0.getVisualMimeType$activity_release(r6)
                r5.setType(r6)
                java.lang.String r6 = "android.intent.extra.ALLOW_MULTIPLE"
                r0 = 1
                r5.putExtra(r6, r0)
                java.lang.String r6 = r5.getType()
                if (r6 != 0) goto Ld0
                java.lang.String r6 = "*/*"
                r5.setType(r6)
                java.lang.String r6 = "image/*"
                java.lang.String r0 = "video/*"
                java.lang.String[] r6 = new java.lang.String[]{r6, r0}
                java.lang.String r0 = "android.intent.extra.MIME_TYPES"
                r5.putExtra(r0, r6)
            Ld0:
                return r5
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, androidx.activity.result.PickVisualMediaRequest r2) {
                r0 = this;
                androidx.activity.result.PickVisualMediaRequest r2 = (androidx.activity.result.PickVisualMediaRequest) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull androidx.activity.result.PickVisualMediaRequest r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context r1, androidx.activity.result.PickVisualMediaRequest r2) {
                r0 = this;
                androidx.activity.result.PickVisualMediaRequest r2 = (androidx.activity.result.PickVisualMediaRequest) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.util.List<android.net.Uri> parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.util.List r1 = r0.parseResult2(r1, r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.NotNull
        /* renamed from: parseResult, reason: avoid collision after fix types in other method */
        public final java.util.List<android.net.Uri> parseResult2(int r2, @org.jetbrains.annotations.Nullable android.content.Intent r3) {
                r1 = this;
                r0 = -1
                if (r2 != r0) goto L4
                goto L5
            L4:
                r3 = 0
            L5:
                if (r3 == 0) goto L10
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r2 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion
                java.util.List r2 = r2.getClipDataUris$activity_release(r3)
                if (r2 == 0) goto L10
                return r2
            L10:
                java.util.List r2 = kotlin.collections.f0.J()
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(19)
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class PickVisualMedia extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.PickVisualMediaRequest, android.net.Uri> {

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String ACTION_SYSTEM_FALLBACK_PICK_IMAGES = "androidx.activity.result.contract.action.PICK_IMAGES";

        @org.jetbrains.annotations.NotNull
        public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion Companion = null;

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String GMS_ACTION_PICK_IMAGES = "com.google.android.gms.provider.action.PICK_IMAGES";

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String GMS_EXTRA_PICK_IMAGES_MAX = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

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

            public static /* synthetic */ void getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations() {
                    return
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations() {
                    return
            }

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.Nullable
            public final android.content.pm.ResolveInfo getGmsPicker$activity_release(@org.jetbrains.annotations.NotNull android.content.Context r3) {
                    r2 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    android.content.pm.PackageManager r3 = r3.getPackageManager()
                    android.content.Intent r0 = new android.content.Intent
                    java.lang.String r1 = "com.google.android.gms.provider.action.PICK_IMAGES"
                    r0.<init>(r1)
                    r1 = 1114112(0x110000, float:1.561203E-39)
                    android.content.pm.ResolveInfo r3 = r3.resolveActivity(r0, r1)
                    return r3
            }

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.Nullable
            public final android.content.pm.ResolveInfo getSystemFallbackPicker$activity_release(@org.jetbrains.annotations.NotNull android.content.Context r3) {
                    r2 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    android.content.pm.PackageManager r3 = r3.getPackageManager()
                    android.content.Intent r0 = new android.content.Intent
                    java.lang.String r1 = "androidx.activity.result.contract.action.PICK_IMAGES"
                    r0.<init>(r1)
                    r1 = 1114112(0x110000, float:1.561203E-39)
                    android.content.pm.ResolveInfo r3 = r3.resolveActivity(r0, r1)
                    return r3
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getVisualMimeType$activity_release(@org.jetbrains.annotations.NotNull androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r2) {
                    r1 = this;
                    java.lang.String r0 = "input"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    boolean r0 = r2 instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly
                    if (r0 == 0) goto Lc
                    java.lang.String r2 = "image/*"
                    return r2
                Lc:
                    boolean r0 = r2 instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VideoOnly
                    if (r0 == 0) goto L14
                    java.lang.String r2 = "video/*"
                    return r2
                L14:
                    boolean r0 = r2 instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.SingleMimeType
                    if (r0 == 0) goto L1f
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$SingleMimeType r2 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.SingleMimeType) r2
                    java.lang.String r2 = r2.getMimeType()
                    return r2
                L1f:
                    boolean r2 = r2 instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo
                    if (r2 == 0) goto L25
                    r2 = 0
                    return r2
                L25:
                    kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
                    r2.<init>()
                    throw r2
            }

            @kotlin.jvm.JvmStatic
            public final boolean isGmsPickerAvailable$activity_release(@org.jetbrains.annotations.NotNull android.content.Context r2) {
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    android.content.pm.ResolveInfo r2 = r1.getGmsPicker$activity_release(r2)
                    if (r2 == 0) goto Ld
                    r2 = 1
                    return r2
                Ld:
                    r2 = 0
                    return r2
            }

            @kotlin.Deprecated(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @kotlin.ReplaceWith(expression = "isPhotoPickerAvailable(context)", imports = {}))
            @kotlin.jvm.JvmStatic
            @android.annotation.SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isPhotoPickerAvailable() {
                    r1 = this;
                    boolean r0 = r1.isSystemPickerAvailable$activity_release()
                    return r0
            }

            @kotlin.jvm.JvmStatic
            @android.annotation.SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isPhotoPickerAvailable(@org.jetbrains.annotations.NotNull android.content.Context r2) {
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    boolean r0 = r1.isSystemPickerAvailable$activity_release()
                    if (r0 != 0) goto L1a
                    boolean r0 = r1.isSystemFallbackPickerAvailable$activity_release(r2)
                    if (r0 != 0) goto L1a
                    boolean r2 = r1.isGmsPickerAvailable$activity_release(r2)
                    if (r2 == 0) goto L18
                    goto L1a
                L18:
                    r2 = 0
                    return r2
                L1a:
                    r2 = 1
                    return r2
            }

            @kotlin.jvm.JvmStatic
            public final boolean isSystemFallbackPickerAvailable$activity_release(@org.jetbrains.annotations.NotNull android.content.Context r2) {
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    android.content.pm.ResolveInfo r2 = r1.getSystemFallbackPicker$activity_release(r2)
                    if (r2 == 0) goto Ld
                    r2 = 1
                    return r2
                Ld:
                    r2 = 0
                    return r2
            }

            @kotlin.jvm.JvmStatic
            @android.annotation.SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isSystemPickerAvailable$activity_release() {
                    r4 = this;
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 33
                    r2 = 1
                    if (r0 < r1) goto L8
                    return r2
                L8:
                    r1 = 0
                    r3 = 30
                    if (r0 < r3) goto L15
                    int r0 = a.b.a(r3)
                    r3 = 2
                    if (r0 < r3) goto L15
                    return r2
                L15:
                    return r1
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class ImageAndVideo implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {

            @org.jetbrains.annotations.NotNull
            public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo INSTANCE = null;

            static {
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo
                    r0.<init>()
                    androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE = r0
                    return
            }

            private ImageAndVideo() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class ImageOnly implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {

            @org.jetbrains.annotations.NotNull
            public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly INSTANCE = null;

            static {
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageOnly r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageOnly
                    r0.<init>()
                    androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE = r0
                    return
            }

            private ImageOnly() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class SingleMimeType implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {

            @org.jetbrains.annotations.NotNull
            private final java.lang.String mimeType;

            public SingleMimeType(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                    r1 = this;
                    java.lang.String r0 = "mimeType"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    r1.<init>()
                    r1.mimeType = r2
                    return
            }

            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMimeType() {
                    r1 = this;
                    java.lang.String r0 = r1.mimeType
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class VideoOnly implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {

            @org.jetbrains.annotations.NotNull
            public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VideoOnly INSTANCE = null;

            static {
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VideoOnly r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VideoOnly
                    r0.<init>()
                    androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VideoOnly.INSTANCE = r0
                    return
            }

            private VideoOnly() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public interface VisualMediaType {
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion = r0
                return
        }

        public PickVisualMedia() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.Nullable
        public static final android.content.pm.ResolveInfo getGmsPicker$activity_release(@org.jetbrains.annotations.NotNull android.content.Context r1) {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                android.content.pm.ResolveInfo r1 = r0.getGmsPicker$activity_release(r1)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.Nullable
        public static final android.content.pm.ResolveInfo getSystemFallbackPicker$activity_release(@org.jetbrains.annotations.NotNull android.content.Context r1) {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                android.content.pm.ResolveInfo r1 = r0.getSystemFallbackPicker$activity_release(r1)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public static final boolean isGmsPickerAvailable$activity_release(@org.jetbrains.annotations.NotNull android.content.Context r1) {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r1 = r0.isGmsPickerAvailable$activity_release(r1)
                return r1
        }

        @kotlin.Deprecated(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @kotlin.ReplaceWith(expression = "isPhotoPickerAvailable(context)", imports = {}))
        @kotlin.jvm.JvmStatic
        @android.annotation.SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean isPhotoPickerAvailable() {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r0 = r0.isPhotoPickerAvailable()
                return r0
        }

        @kotlin.jvm.JvmStatic
        @android.annotation.SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean isPhotoPickerAvailable(@org.jetbrains.annotations.NotNull android.content.Context r1) {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r1 = r0.isPhotoPickerAvailable(r1)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public static final boolean isSystemFallbackPickerAvailable$activity_release(@org.jetbrains.annotations.NotNull android.content.Context r1) {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r1 = r0.isSystemFallbackPickerAvailable$activity_release(r1)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @android.annotation.SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean isSystemPickerAvailable$activity_release() {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r0 = r0.isSystemPickerAvailable$activity_release()
                return r0
        }

        @androidx.annotation.CallSuper
        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r4, @org.jetbrains.annotations.NotNull androidx.activity.result.PickVisualMediaRequest r5) {
                r3 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.g0.p(r5, r0)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r1 = r0.isSystemPickerAvailable$activity_release()
                if (r1 == 0) goto L25
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r1 = "android.provider.action.PICK_IMAGES"
                r4.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r5 = r5.getMediaType()
                java.lang.String r5 = r0.getVisualMimeType$activity_release(r5)
                r4.setType(r5)
                return r4
            L25:
                boolean r1 = r0.isSystemFallbackPickerAvailable$activity_release(r4)
                java.lang.String r2 = "Required value was null."
                if (r1 == 0) goto L57
                android.content.pm.ResolveInfo r4 = r0.getSystemFallbackPicker$activity_release(r4)
                if (r4 == 0) goto L51
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "androidx.activity.result.contract.action.PICK_IMAGES"
                r1.<init>(r2)
                android.content.pm.ApplicationInfo r2 = r4.applicationInfo
                java.lang.String r2 = r2.packageName
                java.lang.String r4 = r4.name
                r1.setClassName(r2, r4)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r4 = r5.getMediaType()
                java.lang.String r4 = r0.getVisualMimeType$activity_release(r4)
                r1.setType(r4)
                return r1
            L51:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                r4.<init>(r2)
                throw r4
            L57:
                boolean r1 = r0.isGmsPickerAvailable$activity_release(r4)
                if (r1 == 0) goto L87
                android.content.pm.ResolveInfo r4 = r0.getGmsPicker$activity_release(r4)
                if (r4 == 0) goto L81
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "com.google.android.gms.provider.action.PICK_IMAGES"
                r1.<init>(r2)
                android.content.pm.ApplicationInfo r2 = r4.applicationInfo
                java.lang.String r2 = r2.packageName
                java.lang.String r4 = r4.name
                r1.setClassName(r2, r4)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r4 = r5.getMediaType()
                java.lang.String r4 = r0.getVisualMimeType$activity_release(r4)
                r1.setType(r4)
                return r1
            L81:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                r4.<init>(r2)
                throw r4
            L87:
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
                r4.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r5 = r5.getMediaType()
                java.lang.String r5 = r0.getVisualMimeType$activity_release(r5)
                r4.setType(r5)
                java.lang.String r5 = r4.getType()
                if (r5 != 0) goto Lb2
                java.lang.String r5 = "*/*"
                r4.setType(r5)
                java.lang.String r5 = "image/*"
                java.lang.String r0 = "video/*"
                java.lang.String[] r5 = new java.lang.String[]{r5, r0}
                java.lang.String r0 = "android.intent.extra.MIME_TYPES"
                r4.putExtra(r0, r5)
            Lb2:
                return r4
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, androidx.activity.result.PickVisualMediaRequest r2) {
                r0 = this;
                androidx.activity.result.PickVisualMediaRequest r2 = (androidx.activity.result.PickVisualMediaRequest) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull androidx.activity.result.PickVisualMediaRequest r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r1, androidx.activity.result.PickVisualMediaRequest r2) {
                r0 = this;
                androidx.activity.result.PickVisualMediaRequest r2 = (androidx.activity.result.PickVisualMediaRequest) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.Nullable
        public final android.net.Uri parseResult(int r3, @org.jetbrains.annotations.Nullable android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto L1b
                android.net.Uri r3 = r4.getData()
                if (r3 != 0) goto L1a
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r3 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion
                java.util.List r3 = r3.getClipDataUris$activity_release(r4)
                java.lang.Object r3 = kotlin.collections.f0.L2(r3)
                android.net.Uri r3 = (android.net.Uri) r3
            L1a:
                return r3
            L1b:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12541#2,2:960\n8676#2,2:962\n9358#2,4:964\n11365#2:968\n11700#2,3:969\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n*L\n188#1:960,2\n195#1:962,2\n195#1:964,4\n208#1:968\n208#1:969,3\n*E\n"})
    public static final class RequestMultiplePermissions extends androidx.activity.result.contract.ActivityResultContract<java.lang.String[], java.util.Map<java.lang.String, java.lang.Boolean>> {

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";

        @org.jetbrains.annotations.NotNull
        public static final androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion Companion = null;

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

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

            @org.jetbrains.annotations.NotNull
            public final android.content.Intent createIntent$activity_release(@org.jetbrains.annotations.NotNull java.lang.String[] r3) {
                    r2 = this;
                    java.lang.String r0 = "input"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    android.content.Intent r0 = new android.content.Intent
                    java.lang.String r1 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
                    r0.<init>(r1)
                    java.lang.String r1 = "androidx.activity.result.contract.extra.PERMISSIONS"
                    android.content.Intent r3 = r0.putExtra(r1, r3)
                    java.lang.String r0 = "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)"
                    kotlin.jvm.internal.g0.o(r3, r0)
                    return r3
            }
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion = r0
                return
        }

        public RequestMultiplePermissions() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String[] r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions$Companion r2 = androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion
                android.content.Intent r2 = r2.createIntent$activity_release(r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.Map<java.lang.String, java.lang.Boolean>> getSynchronousResult(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.Map<java.lang.String, java.lang.Boolean>> getSynchronousResult2(@org.jetbrains.annotations.NotNull android.content.Context r5, @org.jetbrains.annotations.NotNull java.lang.String[] r6) {
                r4 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.g0.p(r6, r0)
                int r0 = r6.length
                if (r0 != 0) goto L17
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r5 = new androidx.activity.result.contract.ActivityResultContract$SynchronousResult
                java.util.Map r6 = kotlin.collections.i1.z()
                r5.<init>(r6)
                return r5
            L17:
                int r0 = r6.length
                r1 = 0
                r2 = 0
            L1a:
                if (r2 >= r0) goto L29
                r3 = r6[r2]
                int r3 = androidx.core.content.ContextCompat.checkSelfPermission(r5, r3)
                if (r3 != 0) goto L27
                int r2 = r2 + 1
                goto L1a
            L27:
                r5 = 0
                return r5
            L29:
                int r5 = r6.length
                int r5 = kotlin.collections.i1.j(r5)
                r0 = 16
                int r5 = kotlin.ranges.t.u(r5, r0)
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>(r5)
                int r5 = r6.length
            L3a:
                if (r1 >= r5) goto L52
                r2 = r6[r1]
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                kotlin.Pair r2 = kotlin.o0.a(r2, r3)
                java.lang.Object r3 = r2.getFirst()
                java.lang.Object r2 = r2.getSecond()
                r0.put(r3, r2)
                int r1 = r1 + 1
                goto L3a
            L52:
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r5 = new androidx.activity.result.contract.ActivityResultContract$SynchronousResult
                r5.<init>(r0)
                return r5
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.util.Map<java.lang.String, java.lang.Boolean> parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.util.Map r1 = r0.parseResult2(r1, r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.NotNull
        /* renamed from: parseResult, reason: avoid collision after fix types in other method */
        public java.util.Map<java.lang.String, java.lang.Boolean> parseResult2(int r6, @org.jetbrains.annotations.Nullable android.content.Intent r7) {
                r5 = this;
                r0 = -1
                if (r6 == r0) goto L8
                java.util.Map r6 = kotlin.collections.i1.z()
                return r6
            L8:
                if (r7 != 0) goto Lf
                java.util.Map r6 = kotlin.collections.i1.z()
                return r6
            Lf:
                java.lang.String r6 = "androidx.activity.result.contract.extra.PERMISSIONS"
                java.lang.String[] r6 = r7.getStringArrayExtra(r6)
                java.lang.String r0 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
                int[] r7 = r7.getIntArrayExtra(r0)
                if (r7 == 0) goto L4d
                if (r6 != 0) goto L20
                goto L4d
            L20:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r7.length
                r0.<init>(r1)
                int r1 = r7.length
                r2 = 0
                r3 = 0
            L29:
                if (r3 >= r1) goto L3c
                r4 = r7[r3]
                if (r4 != 0) goto L31
                r4 = 1
                goto L32
            L31:
                r4 = 0
            L32:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                r0.add(r4)
                int r3 = r3 + 1
                goto L29
            L3c:
                java.util.List r6 = kotlin.collections.n.lb(r6)
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.List r6 = kotlin.collections.f0.o6(r6, r0)
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Map r6 = kotlin.collections.i1.B0(r6)
                return r6
            L4d:
                java.util.Map r6 = kotlin.collections.i1.z()
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12774#2,2:960\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n*L\n228#1:960,2\n*E\n"})
    public static final class RequestPermission extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, java.lang.Boolean> {
        public RequestPermission() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions$Companion r2 = androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion
                java.lang.String[] r3 = new java.lang.String[]{r3}
                android.content.Intent r2 = r2.createIntent$activity_release(r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.g0.p(r3, r0)
                int r2 = androidx.core.content.ContextCompat.checkSelfPermission(r2, r3)
                if (r2 != 0) goto L18
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r2 = new androidx.activity.result.contract.ActivityResultContract$SynchronousResult
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                r2.<init>(r3)
                return r2
            L18:
                r2 = 0
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.NotNull
        public java.lang.Boolean parseResult(int r4, @org.jetbrains.annotations.Nullable android.content.Intent r5) {
                r3 = this;
                if (r5 == 0) goto L21
                r0 = -1
                if (r4 == r0) goto L6
                goto L21
            L6:
                java.lang.String r4 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
                int[] r4 = r5.getIntArrayExtra(r4)
                r5 = 0
                if (r4 == 0) goto L1c
                int r0 = r4.length
                r1 = 0
            L11:
                if (r1 >= r0) goto L1c
                r2 = r4[r1]
                if (r2 != 0) goto L19
                r5 = 1
                goto L1c
            L19:
                int r1 = r1 + 1
                goto L11
            L1c:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
                return r4
            L21:
                java.lang.Boolean r4 = java.lang.Boolean.FALSE
                return r4
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.lang.Boolean parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.lang.Boolean r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class StartActivityForResult extends androidx.activity.result.contract.ActivityResultContract<android.content.Intent, androidx.activity.result.ActivityResult> {

        @org.jetbrains.annotations.NotNull
        public static final androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.Companion Companion = null;

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

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
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.Companion = r0
                return
        }

        public StartActivityForResult() {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull android.content.Intent r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                return r3
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                android.content.Intent r2 = (android.content.Intent) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.NotNull
        public androidx.activity.result.ActivityResult parseResult(int r2, @org.jetbrains.annotations.Nullable android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
                r0.<init>(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResult parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                androidx.activity.result.ActivityResult r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class StartIntentSenderForResult extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.IntentSenderRequest, androidx.activity.result.ActivityResult> {

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";

        @org.jetbrains.annotations.NotNull
        public static final androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.Companion Companion = null;

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

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
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$StartIntentSenderForResult$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$StartIntentSenderForResult$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.Companion = r0
                return
        }

        public StartIntentSenderForResult() {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull androidx.activity.result.IntentSenderRequest r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                r2.<init>(r0)
                java.lang.String r0 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)"
                kotlin.jvm.internal.g0.o(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, androidx.activity.result.IntentSenderRequest r2) {
                r0 = this;
                androidx.activity.result.IntentSenderRequest r2 = (androidx.activity.result.IntentSenderRequest) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.NotNull
        public androidx.activity.result.ActivityResult parseResult(int r2, @org.jetbrains.annotations.Nullable android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
                r0.<init>(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResult parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                androidx.activity.result.ActivityResult r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class TakePicture extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, java.lang.Boolean> {
        public TakePicture() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.CallSuper
        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.media.action.IMAGE_CAPTURE"
                r2.<init>(r0)
                java.lang.String r0 = "output"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)"
                kotlin.jvm.internal.g0.o(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.NotNull
        public final java.lang.Boolean parseResult(int r1, @org.jetbrains.annotations.Nullable android.content.Intent r2) {
                r0 = this;
                r2 = -1
                if (r1 != r2) goto L5
                r1 = 1
                goto L6
            L5:
                r1 = 0
            L6:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.lang.Boolean parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.lang.Boolean r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class TakePicturePreview extends androidx.activity.result.contract.ActivityResultContract<java.lang.Void, android.graphics.Bitmap> {
        public TakePicturePreview() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.Void r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        @androidx.annotation.CallSuper
        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r1, @org.jetbrains.annotations.Nullable java.lang.Void r2) {
                r0 = this;
                java.lang.String r2 = "context"
                kotlin.jvm.internal.g0.p(r1, r2)
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "android.media.action.IMAGE_CAPTURE"
                r1.<init>(r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult(android.content.Context r1, java.lang.Void r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult2(@org.jetbrains.annotations.NotNull android.content.Context r1, @org.jetbrains.annotations.Nullable java.lang.Void r2) {
                r0 = this;
                java.lang.String r2 = "context"
                kotlin.jvm.internal.g0.p(r1, r2)
                r1 = 0
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.Nullable
        public final android.graphics.Bitmap parseResult(int r3, @org.jetbrains.annotations.Nullable android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto L11
                java.lang.String r3 = "data"
                android.os.Parcelable r3 = r4.getParcelableExtra(r3)
                android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
                return r3
            L11:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.graphics.Bitmap parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.graphics.Bitmap r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.Deprecated(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakeVideo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class TakeVideo extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, android.graphics.Bitmap> {
        public TakeVideo() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.CallSuper
        @org.jetbrains.annotations.NotNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.media.action.VIDEO_CAPTURE"
                r2.<init>(r0)
                java.lang.String r0 = "output"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)"
                kotlin.jvm.internal.g0.o(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult2(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r3, r2)
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @org.jetbrains.annotations.Nullable
        public final android.graphics.Bitmap parseResult(int r3, @org.jetbrains.annotations.Nullable android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto L11
                java.lang.String r3 = "data"
                android.os.Parcelable r3 = r4.getParcelableExtra(r3)
                android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
                return r3
            L11:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.graphics.Bitmap parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.graphics.Bitmap r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    private ActivityResultContracts() {
            r0 = this;
            r0.<init>()
            return
    }
}
