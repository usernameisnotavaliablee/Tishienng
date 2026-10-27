package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nViewModelProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ViewModelProvider {

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.viewmodel.CreationExtras defaultCreationExtras;

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.ViewModelProvider.Factory factory;

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.ViewModelStore store;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class AndroidViewModelFactory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public static final androidx.lifecycle.viewmodel.CreationExtras.Key<android.app.Application> APPLICATION_KEY = null;

        @org.jetbrains.annotations.NotNull
        public static final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion Companion = null;

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";

        @org.jetbrains.annotations.Nullable
        private static androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory sInstance;

        @org.jetbrains.annotations.Nullable
        private final android.app.Application application;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class Companion {

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            private static final class ApplicationKeyImpl implements androidx.lifecycle.viewmodel.CreationExtras.Key<android.app.Application> {

                @org.jetbrains.annotations.NotNull
                public static final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.ApplicationKeyImpl INSTANCE = null;

                static {
                        androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl r0 = new androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl
                        r0.<init>()
                        androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.ApplicationKeyImpl.INSTANCE = r0
                        return
                }

                private ApplicationKeyImpl() {
                        r0 = this;
                        r0.<init>()
                        return
                }
            }

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
            public final androidx.lifecycle.ViewModelProvider.Factory defaultFactory$lifecycle_viewmodel_release(@org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelStoreOwner r2) {
                    r1 = this;
                    java.lang.String r0 = "owner"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    boolean r0 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L10
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r2 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r2
                    androidx.lifecycle.ViewModelProvider$Factory r2 = r2.getDefaultViewModelProviderFactory()
                    return r2
                L10:
                    androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion r2 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion
                    androidx.lifecycle.ViewModelProvider$NewInstanceFactory r2 = r2.getInstance()
                    return r2
            }

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.NotNull
            public final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory getInstance(@org.jetbrains.annotations.NotNull android.app.Application r2) {
                    r1 = this;
                    java.lang.String r0 = "application"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.access$getSInstance$cp()
                    if (r0 != 0) goto L13
                    androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = new androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory
                    r0.<init>(r2)
                    androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.access$setSInstance$cp(r0)
                L13:
                    androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r2 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.access$getSInstance$cp()
                    kotlin.jvm.internal.g0.m(r2)
                    return r2
            }
        }

        static {
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion r0 = new androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion = r0
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.ApplicationKeyImpl.INSTANCE
                androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY = r0
                return
        }

        public AndroidViewModelFactory() {
                r2 = this;
                r0 = 0
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        public AndroidViewModelFactory(@org.jetbrains.annotations.NotNull android.app.Application r2) {
                r1 = this;
                java.lang.String r0 = "application"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        private AndroidViewModelFactory(android.app.Application r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.application = r1
                return
        }

        public static final /* synthetic */ androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory access$getSInstance$cp() {
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.sInstance
                return r0
        }

        public static final /* synthetic */ void access$setSInstance$cp(androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory r0) {
                androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.sInstance = r0
                return
        }

        private final <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r6, android.app.Application r7) {
                r5 = this;
                java.lang.String r0 = "Cannot create an instance of "
                java.lang.Class<androidx.lifecycle.AndroidViewModel> r1 = androidx.lifecycle.AndroidViewModel.class
                boolean r1 = r1.isAssignableFrom(r6)
                if (r1 == 0) goto L83
                r1 = 1
                java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.InstantiationException -> L29 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L2d
                java.lang.Class<android.app.Application> r3 = android.app.Application.class
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.InstantiationException -> L29 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L2d
                java.lang.reflect.Constructor r2 = r6.getConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.InstantiationException -> L29 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L2d
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.InstantiationException -> L29 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L2d
                r1[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.InstantiationException -> L29 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L2d
                java.lang.Object r7 = r2.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.InstantiationException -> L29 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L2d
                androidx.lifecycle.ViewModel r7 = (androidx.lifecycle.ViewModel) r7     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.InstantiationException -> L29 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L2d
                java.lang.String r6 = "{\n                try {\n…          }\n            }"
                kotlin.jvm.internal.g0.o(r7, r6)
                return r7
            L27:
                r7 = move-exception
                goto L2f
            L29:
                r7 = move-exception
                goto L44
            L2b:
                r7 = move-exception
                goto L59
            L2d:
                r7 = move-exception
                goto L6e
            L2f:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                r1.<init>(r6, r7)
                throw r1
            L44:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                r1.<init>(r6, r7)
                throw r1
            L59:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                r1.<init>(r6, r7)
                throw r1
            L6e:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                r1.<init>(r6, r7)
                throw r1
            L83:
                androidx.lifecycle.ViewModel r6 = super.create(r6)
                return r6
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public static final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory getInstance(@org.jetbrains.annotations.NotNull android.app.Application r1) {
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r1 = r0.getInstance(r1)
                return r1
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        @org.jetbrains.annotations.NotNull
        public <T extends androidx.lifecycle.ViewModel> T create(@org.jetbrains.annotations.NotNull java.lang.Class<T> r2) {
                r1 = this;
                java.lang.String r0 = "modelClass"
                kotlin.jvm.internal.g0.p(r2, r0)
                android.app.Application r0 = r1.application
                if (r0 == 0) goto Le
                androidx.lifecycle.ViewModel r2 = r1.create(r2, r0)
                return r2
            Le:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras)."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        @org.jetbrains.annotations.NotNull
        public <T extends androidx.lifecycle.ViewModel> T create(@org.jetbrains.annotations.NotNull java.lang.Class<T> r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.CreationExtras r3) {
                r1 = this;
                java.lang.String r0 = "modelClass"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "extras"
                kotlin.jvm.internal.g0.p(r3, r0)
                android.app.Application r0 = r1.application
                if (r0 == 0) goto L13
                androidx.lifecycle.ViewModel r2 = r1.create(r2)
                return r2
            L13:
                androidx.lifecycle.viewmodel.CreationExtras$Key<android.app.Application> r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
                java.lang.Object r3 = r3.get(r0)
                android.app.Application r3 = (android.app.Application) r3
                if (r3 == 0) goto L22
                androidx.lifecycle.ViewModel r2 = r1.create(r2, r3)
                return r2
            L22:
                java.lang.Class<androidx.lifecycle.AndroidViewModel> r3 = androidx.lifecycle.AndroidViewModel.class
                boolean r3 = r3.isAssignableFrom(r2)
                if (r3 != 0) goto L2f
                androidx.lifecycle.ViewModel r2 = super.create(r2)
                return r2
            L2f:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "CreationExtras must have an application by `APPLICATION_KEY`"
                r2.<init>(r3)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Factory {

        @org.jetbrains.annotations.NotNull
        public static final androidx.lifecycle.ViewModelProvider.Factory.Companion Companion = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class Companion {
            static final /* synthetic */ androidx.lifecycle.ViewModelProvider.Factory.Companion $$INSTANCE = null;

            static {
                    androidx.lifecycle.ViewModelProvider$Factory$Companion r0 = new androidx.lifecycle.ViewModelProvider$Factory$Companion
                    r0.<init>()
                    androidx.lifecycle.ViewModelProvider.Factory.Companion.$$INSTANCE = r0
                    return
            }

            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.NotNull
            public final androidx.lifecycle.ViewModelProvider.Factory from(@org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.ViewModelInitializer<?>... r3) {
                    r2 = this;
                    java.lang.String r0 = "initializers"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    androidx.lifecycle.viewmodel.InitializerViewModelFactory r0 = new androidx.lifecycle.viewmodel.InitializerViewModelFactory
                    int r1 = r3.length
                    java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
                    androidx.lifecycle.viewmodel.ViewModelInitializer[] r3 = (androidx.lifecycle.viewmodel.ViewModelInitializer[]) r3
                    r0.<init>(r3)
                    return r0
            }
        }

        static {
                androidx.lifecycle.ViewModelProvider$Factory$Companion r0 = androidx.lifecycle.ViewModelProvider.Factory.Companion.$$INSTANCE
                androidx.lifecycle.ViewModelProvider.Factory.Companion = r0
                return
        }

        @org.jetbrains.annotations.NotNull
        <T extends androidx.lifecycle.ViewModel> T create(@org.jetbrains.annotations.NotNull java.lang.Class<T> r1);

        @org.jetbrains.annotations.NotNull
        <T extends androidx.lifecycle.ViewModel> T create(@org.jetbrains.annotations.NotNull java.lang.Class<T> r1, @org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.CreationExtras r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NewInstanceFactory implements androidx.lifecycle.ViewModelProvider.Factory {

        @org.jetbrains.annotations.NotNull
        public static final androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion Companion = null;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public static final androidx.lifecycle.viewmodel.CreationExtras.Key<java.lang.String> VIEW_MODEL_KEY = null;

        @org.jetbrains.annotations.Nullable
        private static androidx.lifecycle.ViewModelProvider.NewInstanceFactory sInstance;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class Companion {

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            private static final class ViewModelKeyImpl implements androidx.lifecycle.viewmodel.CreationExtras.Key<java.lang.String> {

                @org.jetbrains.annotations.NotNull
                public static final androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl INSTANCE = null;

                static {
                        androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl r0 = new androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl
                        r0.<init>()
                        androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.INSTANCE = r0
                        return
                }

                private ViewModelKeyImpl() {
                        r0 = this;
                        r0.<init>()
                        return
                }
            }

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

            @kotlin.jvm.JvmStatic
            public static /* synthetic */ void getInstance$annotations() {
                    return
            }

            @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
            @org.jetbrains.annotations.NotNull
            public final androidx.lifecycle.ViewModelProvider.NewInstanceFactory getInstance() {
                    r1 = this;
                    androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.access$getSInstance$cp()
                    if (r0 != 0) goto Le
                    androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = new androidx.lifecycle.ViewModelProvider$NewInstanceFactory
                    r0.<init>()
                    androidx.lifecycle.ViewModelProvider.NewInstanceFactory.access$setSInstance$cp(r0)
                Le:
                    androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.access$getSInstance$cp()
                    kotlin.jvm.internal.g0.m(r0)
                    return r0
            }
        }

        static {
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion r0 = new androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion = r0
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.INSTANCE
                androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY = r0
                return
        }

        public NewInstanceFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ androidx.lifecycle.ViewModelProvider.NewInstanceFactory access$getSInstance$cp() {
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.sInstance
                return r0
        }

        public static final /* synthetic */ void access$setSInstance$cp(androidx.lifecycle.ViewModelProvider.NewInstanceFactory r0) {
                androidx.lifecycle.ViewModelProvider.NewInstanceFactory.sInstance = r0
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        @org.jetbrains.annotations.NotNull
        public static final androidx.lifecycle.ViewModelProvider.NewInstanceFactory getInstance() {
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = r0.getInstance()
                return r0
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @org.jetbrains.annotations.NotNull
        public <T extends androidx.lifecycle.ViewModel> T create(@org.jetbrains.annotations.NotNull java.lang.Class<T> r5) {
                r4 = this;
                java.lang.String r0 = "Cannot create an instance of "
                java.lang.String r1 = "modelClass"
                kotlin.jvm.internal.g0.p(r5, r1)
                r1 = 0
                java.lang.reflect.Constructor r2 = r5.getDeclaredConstructor(r1)     // Catch: java.lang.IllegalAccessException -> L19 java.lang.InstantiationException -> L1b java.lang.NoSuchMethodException -> L1d
                java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.IllegalAccessException -> L19 java.lang.InstantiationException -> L1b java.lang.NoSuchMethodException -> L1d
                java.lang.String r2 = "{\n                modelC…wInstance()\n            }"
                kotlin.jvm.internal.g0.o(r1, r2)     // Catch: java.lang.IllegalAccessException -> L19 java.lang.InstantiationException -> L1b java.lang.NoSuchMethodException -> L1d
                androidx.lifecycle.ViewModel r1 = (androidx.lifecycle.ViewModel) r1     // Catch: java.lang.IllegalAccessException -> L19 java.lang.InstantiationException -> L1b java.lang.NoSuchMethodException -> L1d
                return r1
            L19:
                r1 = move-exception
                goto L1f
            L1b:
                r1 = move-exception
                goto L34
            L1d:
                r1 = move-exception
                goto L49
            L1f:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r5)
                java.lang.String r5 = r3.toString()
                r2.<init>(r5, r1)
                throw r2
            L34:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r5)
                java.lang.String r5 = r3.toString()
                r2.<init>(r5, r1)
                throw r2
            L49:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r5)
                java.lang.String r5 = r3.toString()
                r2.<init>(r5, r1)
                throw r2
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ androidx.lifecycle.ViewModel create(java.lang.Class r1, androidx.lifecycle.viewmodel.CreationExtras r2) {
                r0 = this;
                androidx.lifecycle.ViewModel r1 = androidx.lifecycle.l.b(r0, r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static class OnRequeryFactory {
        public OnRequeryFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onRequery(@org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModel r2) {
                r1 = this;
                java.lang.String r0 = "viewModel"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }
    }

    @kotlin.jvm.JvmOverloads
    public ViewModelProvider(@org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelStore r8, @org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelProvider.Factory r9) {
            r7 = this;
            java.lang.String r0 = "store"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    @kotlin.jvm.JvmOverloads
    public ViewModelProvider(@org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelStore r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelProvider.Factory r3, @org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.CreationExtras r4) {
            r1 = this;
            java.lang.String r0 = "store"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "defaultCreationExtras"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.store = r2
            r1.factory = r3
            r1.defaultCreationExtras = r4
            return
    }

    public /* synthetic */ ViewModelProvider(androidx.lifecycle.ViewModelStore r1, androidx.lifecycle.ViewModelProvider.Factory r2, androidx.lifecycle.viewmodel.CreationExtras r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L6
            androidx.lifecycle.viewmodel.CreationExtras$Empty r3 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
        L6:
            r0.<init>(r1, r2, r3)
            return
    }

    public ViewModelProvider(@org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelStoreOwner r3) {
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.ViewModelStore r0 = r3.getViewModelStore()
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion r1 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion
            androidx.lifecycle.ViewModelProvider$Factory r1 = r1.defaultFactory$lifecycle_viewmodel_release(r3)
            androidx.lifecycle.viewmodel.CreationExtras r3 = androidx.lifecycle.ViewModelProviderGetKt.defaultCreationExtras(r3)
            r2.<init>(r0, r1, r3)
            return
    }

    public ViewModelProvider(@org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelStoreOwner r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelProvider.Factory r3) {
            r1 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.ViewModelStore r0 = r2.getViewModelStore()
            androidx.lifecycle.viewmodel.CreationExtras r2 = androidx.lifecycle.ViewModelProviderGetKt.defaultCreationExtras(r2)
            r1.<init>(r0, r3, r2)
            return
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public <T extends androidx.lifecycle.ViewModel> T get(@org.jetbrains.annotations.NotNull java.lang.Class<T> r4) {
            r3 = this;
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = r4.getCanonicalName()
            if (r0 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            androidx.lifecycle.ViewModel r4 = r3.get(r0, r4)
            return r4
        L21:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            r4.<init>(r0)
            throw r4
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public <T extends androidx.lifecycle.ViewModel> T get(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.Class<T> r4) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.lifecycle.ViewModelStore r0 = r2.store
            androidx.lifecycle.ViewModel r0 = r0.get(r3)
            boolean r1 = r4.isInstance(r0)
            if (r1 == 0) goto L2e
            androidx.lifecycle.ViewModelProvider$Factory r3 = r2.factory
            boolean r4 = r3 instanceof androidx.lifecycle.ViewModelProvider.OnRequeryFactory
            if (r4 == 0) goto L1f
            androidx.lifecycle.ViewModelProvider$OnRequeryFactory r3 = (androidx.lifecycle.ViewModelProvider.OnRequeryFactory) r3
            goto L20
        L1f:
            r3 = 0
        L20:
            if (r3 == 0) goto L28
            kotlin.jvm.internal.g0.m(r0)
            r3.onRequery(r0)
        L28:
            java.lang.String r3 = "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"
            kotlin.jvm.internal.g0.n(r0, r3)
            return r0
        L2e:
            androidx.lifecycle.viewmodel.MutableCreationExtras r0 = new androidx.lifecycle.viewmodel.MutableCreationExtras
            androidx.lifecycle.viewmodel.CreationExtras r1 = r2.defaultCreationExtras
            r0.<init>(r1)
            androidx.lifecycle.viewmodel.CreationExtras$Key<java.lang.String> r1 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY
            r0.set(r1, r3)
            androidx.lifecycle.ViewModelProvider$Factory r1 = r2.factory     // Catch: java.lang.AbstractMethodError -> L41
            androidx.lifecycle.ViewModel r4 = r1.create(r4, r0)     // Catch: java.lang.AbstractMethodError -> L41
            goto L47
        L41:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r2.factory
            androidx.lifecycle.ViewModel r4 = r0.create(r4)
        L47:
            androidx.lifecycle.ViewModelStore r0 = r2.store
            r0.put(r3, r4)
            return r4
    }
}
