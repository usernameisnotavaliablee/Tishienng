package androidx.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TextViewCompat {
    public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static int getBreakStrategy(android.widget.TextView r0) {
                int r0 = r0.getBreakStrategy()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.content.res.ColorStateList getCompoundDrawableTintList(android.widget.TextView r0) {
                android.content.res.ColorStateList r0 = r0.getCompoundDrawableTintList()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.graphics.PorterDuff.Mode getCompoundDrawableTintMode(android.widget.TextView r0) {
                android.graphics.PorterDuff$Mode r0 = r0.getCompoundDrawableTintMode()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getHyphenationFrequency(android.widget.TextView r0) {
                int r0 = r0.getHyphenationFrequency()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setBreakStrategy(android.widget.TextView r0, int r1) {
                r0.setBreakStrategy(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setCompoundDrawableTintList(android.widget.TextView r0, android.content.res.ColorStateList r1) {
                r0.setCompoundDrawableTintList(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setCompoundDrawableTintMode(android.widget.TextView r0, android.graphics.PorterDuff.Mode r1) {
                r0.setCompoundDrawableTintMode(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setHyphenationFrequency(android.widget.TextView r0, int r1) {
                r0.setHyphenationFrequency(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.icu.text.DecimalFormatSymbols getInstance(java.util.Locale r0) {
                android.icu.text.DecimalFormatSymbols r0 = android.icu.text.DecimalFormatSymbols.getInstance(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(26)
    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static int getAutoSizeMaxTextSize(android.widget.TextView r0) {
                int r0 = r0.getAutoSizeMaxTextSize()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getAutoSizeMinTextSize(android.widget.TextView r0) {
                int r0 = r0.getAutoSizeMinTextSize()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getAutoSizeStepGranularity(android.widget.TextView r0) {
                int r0 = r0.getAutoSizeStepGranularity()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int[] getAutoSizeTextAvailableSizes(android.widget.TextView r0) {
                int[] r0 = r0.getAutoSizeTextAvailableSizes()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getAutoSizeTextType(android.widget.TextView r0) {
                int r0 = r0.getAutoSizeTextType()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setAutoSizeTextTypeUniformWithConfiguration(android.widget.TextView r0, int r1, int r2, int r3, int r4) {
                r0.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4)
                return
        }

        @androidx.annotation.DoNotInline
        static void setAutoSizeTextTypeUniformWithPresetSizes(android.widget.TextView r0, int[] r1, int r2) {
                r0.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2)
                return
        }

        @androidx.annotation.DoNotInline
        static void setAutoSizeTextTypeWithDefaults(android.widget.TextView r0, int r1) {
                r0.setAutoSizeTextTypeWithDefaults(r1)
                return
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
        static java.lang.CharSequence castToCharSequence(android.text.PrecomputedText r0) {
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.lang.String[] getDigitStrings(android.icu.text.DecimalFormatSymbols r0) {
                java.lang.String[] r0 = r0.getDigitStrings()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.text.PrecomputedText.Params getTextMetricsParams(android.widget.TextView r0) {
                android.text.PrecomputedText$Params r0 = r0.getTextMetricsParams()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setFirstBaselineToTopHeight(android.widget.TextView r0, int r1) {
                r0.setFirstBaselineToTopHeight(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(34)
    static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setLineHeight(@androidx.annotation.NonNull android.widget.TextView r0, int r1, @androidx.annotation.FloatRange(from = 0.0d) float r2) {
                r0.setLineHeight(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface AutoSizeTextType {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(26)
    private static class OreoCallback implements android.view.ActionMode.Callback {
        private static final int MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
        private final android.view.ActionMode.Callback mCallback;
        private boolean mCanUseMenuBuilderReferences;
        private boolean mInitializedMenuBuilderReferences;
        private java.lang.Class<?> mMenuBuilderClass;
        private java.lang.reflect.Method mMenuBuilderRemoveItemAtMethod;
        private final android.widget.TextView mTextView;

        OreoCallback(android.view.ActionMode.Callback r1, android.widget.TextView r2) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                r0.mTextView = r2
                r1 = 0
                r0.mInitializedMenuBuilderReferences = r1
                return
        }

        private android.content.Intent createProcessTextIntent() {
                r2 = this;
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = "android.intent.action.PROCESS_TEXT"
                android.content.Intent r0 = r0.setAction(r1)
                java.lang.String r1 = "text/plain"
                android.content.Intent r0 = r0.setType(r1)
                return r0
        }

        private android.content.Intent createProcessTextIntentForResolveInfo(android.content.pm.ResolveInfo r3, android.widget.TextView r4) {
                r2 = this;
                android.content.Intent r0 = r2.createProcessTextIntent()
                boolean r4 = r2.isEditable(r4)
                r4 = r4 ^ 1
                java.lang.String r1 = "android.intent.extra.PROCESS_TEXT_READONLY"
                android.content.Intent r4 = r0.putExtra(r1, r4)
                android.content.pm.ActivityInfo r3 = r3.activityInfo
                java.lang.String r0 = r3.packageName
                java.lang.String r3 = r3.name
                android.content.Intent r3 = r4.setClassName(r0, r3)
                return r3
        }

        private java.util.List<android.content.pm.ResolveInfo> getSupportedActivities(android.content.Context r4, android.content.pm.PackageManager r5) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                boolean r1 = r4 instanceof android.app.Activity
                if (r1 != 0) goto La
                goto L2d
            La:
                android.content.Intent r1 = r3.createProcessTextIntent()
                r2 = 0
                java.util.List r5 = r5.queryIntentActivities(r1, r2)
                java.util.Iterator r5 = r5.iterator()
            L17:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L2d
                java.lang.Object r1 = r5.next()
                android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
                boolean r2 = r3.isSupportedActivity(r1, r4)
                if (r2 == 0) goto L17
                r0.add(r1)
                goto L17
            L2d:
                return r0
        }

        private boolean isEditable(android.widget.TextView r2) {
                r1 = this;
                boolean r0 = r2 instanceof android.text.Editable
                if (r0 == 0) goto L12
                boolean r0 = r2.onCheckIsTextEditor()
                if (r0 == 0) goto L12
                boolean r2 = r2.isEnabled()
                if (r2 == 0) goto L12
                r2 = 1
                return r2
            L12:
                r2 = 0
                return r2
        }

        private boolean isSupportedActivity(android.content.pm.ResolveInfo r4, android.content.Context r5) {
                r3 = this;
                java.lang.String r0 = r5.getPackageName()
                android.content.pm.ActivityInfo r1 = r4.activityInfo
                java.lang.String r1 = r1.packageName
                boolean r0 = r0.equals(r1)
                r1 = 1
                if (r0 == 0) goto L10
                return r1
            L10:
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                boolean r0 = r4.exported
                r2 = 0
                if (r0 != 0) goto L18
                return r2
            L18:
                java.lang.String r4 = r4.permission
                if (r4 == 0) goto L24
                int r4 = androidx.core.app.q.a(r5, r4)
                if (r4 != 0) goto L23
                goto L24
            L23:
                return r2
            L24:
                return r1
        }

        private void recomputeProcessTextMenuItems(android.view.Menu r9) {
                r8 = this;
                android.widget.TextView r0 = r8.mTextView
                android.content.Context r0 = r0.getContext()
                android.content.pm.PackageManager r1 = r0.getPackageManager()
                boolean r2 = r8.mInitializedMenuBuilderReferences
                java.lang.Class r3 = java.lang.Integer.TYPE
                java.lang.String r4 = "removeItemAt"
                r5 = 0
                r6 = 1
                if (r2 != 0) goto L32
                r8.mInitializedMenuBuilderReferences = r6
                java.lang.String r2 = "com.android.internal.view.menu.MenuBuilder"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L2b
                r8.mMenuBuilderClass = r2     // Catch: java.lang.Throwable -> L2b
                java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L2b
                r7[r5] = r3     // Catch: java.lang.Throwable -> L2b
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L2b
                r8.mMenuBuilderRemoveItemAtMethod = r2     // Catch: java.lang.Throwable -> L2b
                r8.mCanUseMenuBuilderReferences = r6     // Catch: java.lang.Throwable -> L2b
                goto L32
            L2b:
                r2 = 0
                r8.mMenuBuilderClass = r2
                r8.mMenuBuilderRemoveItemAtMethod = r2
                r8.mCanUseMenuBuilderReferences = r5
            L32:
                boolean r2 = r8.mCanUseMenuBuilderReferences     // Catch: java.lang.Throwable -> La7
                if (r2 == 0) goto L41
                java.lang.Class<?> r2 = r8.mMenuBuilderClass     // Catch: java.lang.Throwable -> La7
                boolean r2 = r2.isInstance(r9)     // Catch: java.lang.Throwable -> La7
                if (r2 == 0) goto L41
                java.lang.reflect.Method r2 = r8.mMenuBuilderRemoveItemAtMethod     // Catch: java.lang.Throwable -> La7
                goto L4d
            L41:
                java.lang.Class r2 = r9.getClass()     // Catch: java.lang.Throwable -> La7
                java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> La7
                r7[r5] = r3     // Catch: java.lang.Throwable -> La7
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> La7
            L4d:
                int r3 = r9.size()     // Catch: java.lang.Throwable -> La7
                int r3 = r3 - r6
            L52:
                if (r3 < 0) goto L7c
                android.view.MenuItem r4 = r9.getItem(r3)     // Catch: java.lang.Throwable -> La7
                android.content.Intent r7 = r4.getIntent()     // Catch: java.lang.Throwable -> La7
                if (r7 == 0) goto L79
                java.lang.String r7 = "android.intent.action.PROCESS_TEXT"
                android.content.Intent r4 = r4.getIntent()     // Catch: java.lang.Throwable -> La7
                java.lang.String r4 = r4.getAction()     // Catch: java.lang.Throwable -> La7
                boolean r4 = r7.equals(r4)     // Catch: java.lang.Throwable -> La7
                if (r4 == 0) goto L79
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> La7
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> La7
                r7[r5] = r4     // Catch: java.lang.Throwable -> La7
                r2.invoke(r9, r7)     // Catch: java.lang.Throwable -> La7
            L79:
                int r3 = r3 + (-1)
                goto L52
            L7c:
                java.util.List r0 = r8.getSupportedActivities(r0, r1)
                r2 = 0
            L81:
                int r3 = r0.size()
                if (r2 >= r3) goto La7
                java.lang.Object r3 = r0.get(r2)
                android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
                int r4 = r2 + 100
                java.lang.CharSequence r7 = r3.loadLabel(r1)
                android.view.MenuItem r4 = r9.add(r5, r5, r4, r7)
                android.widget.TextView r7 = r8.mTextView
                android.content.Intent r3 = r8.createProcessTextIntentForResolveInfo(r3, r7)
                android.view.MenuItem r3 = r4.setIntent(r3)
                r3.setShowAsAction(r6)
                int r2 = r2 + 1
                goto L81
            La7:
                return
        }

        @androidx.annotation.NonNull
        android.view.ActionMode.Callback getWrappedCallback() {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.mCallback
                return r0
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(android.view.ActionMode r2, android.view.MenuItem r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.mCallback
                boolean r2 = r0.onActionItemClicked(r2, r3)
                return r2
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(android.view.ActionMode r2, android.view.Menu r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.mCallback
                boolean r2 = r0.onCreateActionMode(r2, r3)
                return r2
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(android.view.ActionMode r2) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.mCallback
                r0.onDestroyActionMode(r2)
                return
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(android.view.ActionMode r2, android.view.Menu r3) {
                r1 = this;
                r1.recomputeProcessTextMenuItems(r3)
                android.view.ActionMode$Callback r0 = r1.mCallback
                boolean r2 = r0.onPrepareActionMode(r2, r3)
                return r2
        }
    }

    private TextViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getAutoSizeMaxTextSize(@androidx.annotation.NonNull android.widget.TextView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Lb
            int r2 = androidx.core.widget.TextViewCompat.Api26Impl.getAutoSizeMaxTextSize(r2)
            return r2
        Lb:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L16
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            int r2 = r2.getAutoSizeMaxTextSize()
            return r2
        L16:
            r2 = -1
            return r2
    }

    public static int getAutoSizeMinTextSize(@androidx.annotation.NonNull android.widget.TextView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Lb
            int r2 = androidx.core.widget.TextViewCompat.Api26Impl.getAutoSizeMinTextSize(r2)
            return r2
        Lb:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L16
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            int r2 = r2.getAutoSizeMinTextSize()
            return r2
        L16:
            r2 = -1
            return r2
    }

    public static int getAutoSizeStepGranularity(@androidx.annotation.NonNull android.widget.TextView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Lb
            int r2 = androidx.core.widget.TextViewCompat.Api26Impl.getAutoSizeStepGranularity(r2)
            return r2
        Lb:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L16
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            int r2 = r2.getAutoSizeStepGranularity()
            return r2
        L16:
            r2 = -1
            return r2
    }

    @androidx.annotation.NonNull
    public static int[] getAutoSizeTextAvailableSizes(@androidx.annotation.NonNull android.widget.TextView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Lb
            int[] r2 = androidx.core.widget.TextViewCompat.Api26Impl.getAutoSizeTextAvailableSizes(r2)
            return r2
        Lb:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L16
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            int[] r2 = r2.getAutoSizeTextAvailableSizes()
            return r2
        L16:
            r2 = 0
            int[] r2 = new int[r2]
            return r2
    }

    public static int getAutoSizeTextType(@androidx.annotation.NonNull android.widget.TextView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Lb
            int r2 = androidx.core.widget.TextViewCompat.Api26Impl.getAutoSizeTextType(r2)
            return r2
        Lb:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L16
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            int r2 = r2.getAutoSizeTextType()
            return r2
        L16:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList getCompoundDrawableTintList(@androidx.annotation.NonNull android.widget.TextView r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Le
            android.content.res.ColorStateList r2 = androidx.core.widget.TextViewCompat.Api23Impl.getCompoundDrawableTintList(r2)
            return r2
        Le:
            boolean r0 = r2 instanceof androidx.core.widget.TintableCompoundDrawablesView
            if (r0 == 0) goto L19
            androidx.core.widget.TintableCompoundDrawablesView r2 = (androidx.core.widget.TintableCompoundDrawablesView) r2
            android.content.res.ColorStateList r2 = r2.getSupportCompoundDrawablesTintList()
            return r2
        L19:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public static android.graphics.PorterDuff.Mode getCompoundDrawableTintMode(@androidx.annotation.NonNull android.widget.TextView r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Le
            android.graphics.PorterDuff$Mode r2 = androidx.core.widget.TextViewCompat.Api23Impl.getCompoundDrawableTintMode(r2)
            return r2
        Le:
            boolean r0 = r2 instanceof androidx.core.widget.TintableCompoundDrawablesView
            if (r0 == 0) goto L19
            androidx.core.widget.TintableCompoundDrawablesView r2 = (androidx.core.widget.TintableCompoundDrawablesView) r2
            android.graphics.PorterDuff$Mode r2 = r2.getSupportCompoundDrawablesTintMode()
            return r2
        L19:
            r2 = 0
            return r2
    }

    @androidx.annotation.NonNull
    public static android.graphics.drawable.Drawable[] getCompoundDrawablesRelative(@androidx.annotation.NonNull android.widget.TextView r0) {
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            return r0
    }

    public static int getFirstBaselineToTopHeight(@androidx.annotation.NonNull android.widget.TextView r1) {
            int r0 = r1.getPaddingTop()
            android.text.TextPaint r1 = r1.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.top
            int r0 = r0 - r1
            return r0
    }

    public static int getLastBaselineToBottomHeight(@androidx.annotation.NonNull android.widget.TextView r1) {
            int r0 = r1.getPaddingBottom()
            android.text.TextPaint r1 = r1.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.bottom
            int r0 = r0 + r1
            return r0
    }

    public static int getMaxLines(@androidx.annotation.NonNull android.widget.TextView r0) {
            int r0 = r0.getMaxLines()
            return r0
    }

    public static int getMinLines(@androidx.annotation.NonNull android.widget.TextView r0) {
            int r0 = r0.getMinLines()
            return r0
    }

    private static int getTextDirection(@androidx.annotation.NonNull android.text.TextDirectionHeuristic r4) {
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            r1 = 1
            if (r4 != r0) goto L6
            return r1
        L6:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r4 != r2) goto Lb
            return r1
        Lb:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r4 != r3) goto L11
            r4 = 2
            return r4
        L11:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LTR
            if (r4 != r3) goto L17
            r4 = 3
            return r4
        L17:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.RTL
            if (r4 != r3) goto L1d
            r4 = 4
            return r4
        L1d:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LOCALE
            if (r4 != r3) goto L23
            r4 = 5
            return r4
        L23:
            if (r4 != r2) goto L27
            r4 = 6
            return r4
        L27:
            if (r4 != r0) goto L2b
            r4 = 7
            return r4
        L2b:
            return r1
    }

    private static android.text.TextDirectionHeuristic getTextDirectionHeuristic(@androidx.annotation.NonNull android.widget.TextView r4) {
            android.text.method.TransformationMethod r0 = r4.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto Lb
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LTR
            return r4
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L3e
            int r0 = r4.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L3e
            java.util.Locale r4 = r4.getTextLocale()
            android.icu.text.DecimalFormatSymbols r4 = androidx.core.widget.TextViewCompat.Api24Impl.getInstance(r4)
            java.lang.String[] r4 = androidx.core.widget.TextViewCompat.Api28Impl.getDigitStrings(r4)
            r4 = r4[r3]
            int r4 = r4.codePointAt(r3)
            byte r4 = java.lang.Character.getDirectionality(r4)
            if (r4 == r2) goto L3b
            r0 = 2
            if (r4 != r0) goto L38
            goto L3b
        L38:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LTR
            return r4
        L3b:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.RTL
            return r4
        L3e:
            int r0 = r4.getLayoutDirection()
            if (r0 != r2) goto L45
            goto L46
        L45:
            r2 = 0
        L46:
            int r4 = r4.getTextDirection()
            switch(r4) {
                case 2: goto L64;
                case 3: goto L61;
                case 4: goto L5e;
                case 5: goto L5b;
                case 6: goto L58;
                case 7: goto L55;
                default: goto L4d;
            }
        L4d:
            if (r2 == 0) goto L52
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            return r4
        L52:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            return r4
        L55:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            return r4
        L58:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            return r4
        L5b:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LOCALE
            return r4
        L5e:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.RTL
            return r4
        L61:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LTR
            return r4
        L64:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            return r4
    }

    @androidx.annotation.NonNull
    public static androidx.core.text.PrecomputedTextCompat.Params getTextMetricsParams(@androidx.annotation.NonNull android.widget.TextView r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            androidx.core.text.PrecomputedTextCompat$Params r0 = new androidx.core.text.PrecomputedTextCompat$Params
            android.text.PrecomputedText$Params r4 = androidx.core.widget.TextViewCompat.Api28Impl.getTextMetricsParams(r4)
            r0.<init>(r4)
            return r0
        L10:
            androidx.core.text.PrecomputedTextCompat$Params$Builder r1 = new androidx.core.text.PrecomputedTextCompat$Params$Builder
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r4.getPaint()
            r2.<init>(r3)
            r1.<init>(r2)
            r2 = 23
            if (r0 < r2) goto L30
            int r0 = androidx.core.widget.TextViewCompat.Api23Impl.getBreakStrategy(r4)
            r1.setBreakStrategy(r0)
            int r0 = androidx.core.widget.TextViewCompat.Api23Impl.getHyphenationFrequency(r4)
            r1.setHyphenationFrequency(r0)
        L30:
            android.text.TextDirectionHeuristic r4 = getTextDirectionHeuristic(r4)
            r1.setTextDirection(r4)
            androidx.core.text.PrecomputedTextCompat$Params r4 = r1.build()
            return r4
    }

    public static void setAutoSizeTextTypeUniformWithConfiguration(@androidx.annotation.NonNull android.widget.TextView r2, int r3, int r4, int r5, int r6) throws java.lang.IllegalArgumentException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto La
            androidx.core.widget.TextViewCompat.Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5, r6)
            return
        La:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L13
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            r2.setAutoSizeTextTypeUniformWithConfiguration(r3, r4, r5, r6)
        L13:
            return
    }

    public static void setAutoSizeTextTypeUniformWithPresetSizes(@androidx.annotation.NonNull android.widget.TextView r2, @androidx.annotation.NonNull int[] r3, int r4) throws java.lang.IllegalArgumentException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto La
            androidx.core.widget.TextViewCompat.Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3, r4)
            return
        La:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L13
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r3, r4)
        L13:
            return
    }

    public static void setAutoSizeTextTypeWithDefaults(@androidx.annotation.NonNull android.widget.TextView r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto La
            androidx.core.widget.TextViewCompat.Api26Impl.setAutoSizeTextTypeWithDefaults(r2, r3)
            return
        La:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L13
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            r2.setAutoSizeTextTypeWithDefaults(r3)
        L13:
            return
    }

    public static void setCompoundDrawableTintList(@androidx.annotation.NonNull android.widget.TextView r2, @androidx.annotation.Nullable android.content.res.ColorStateList r3) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Ld
            androidx.core.widget.TextViewCompat.Api23Impl.setCompoundDrawableTintList(r2, r3)
            return
        Ld:
            boolean r0 = r2 instanceof androidx.core.widget.TintableCompoundDrawablesView
            if (r0 == 0) goto L16
            androidx.core.widget.TintableCompoundDrawablesView r2 = (androidx.core.widget.TintableCompoundDrawablesView) r2
            r2.setSupportCompoundDrawablesTintList(r3)
        L16:
            return
    }

    public static void setCompoundDrawableTintMode(@androidx.annotation.NonNull android.widget.TextView r2, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r3) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Ld
            androidx.core.widget.TextViewCompat.Api23Impl.setCompoundDrawableTintMode(r2, r3)
            return
        Ld:
            boolean r0 = r2 instanceof androidx.core.widget.TintableCompoundDrawablesView
            if (r0 == 0) goto L16
            androidx.core.widget.TintableCompoundDrawablesView r2 = (androidx.core.widget.TintableCompoundDrawablesView) r2
            r2.setSupportCompoundDrawablesTintMode(r3)
        L16:
            return
    }

    public static void setCompoundDrawablesRelative(@androidx.annotation.NonNull android.widget.TextView r0, @androidx.annotation.Nullable android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.graphics.drawable.Drawable r2, @androidx.annotation.Nullable android.graphics.drawable.Drawable r3, @androidx.annotation.Nullable android.graphics.drawable.Drawable r4) {
            r0.setCompoundDrawablesRelative(r1, r2, r3, r4)
            return
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(@androidx.annotation.NonNull android.widget.TextView r0, @androidx.annotation.DrawableRes int r1, @androidx.annotation.DrawableRes int r2, @androidx.annotation.DrawableRes int r3, @androidx.annotation.DrawableRes int r4) {
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(@androidx.annotation.NonNull android.widget.TextView r0, @androidx.annotation.Nullable android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.graphics.drawable.Drawable r2, @androidx.annotation.Nullable android.graphics.drawable.Drawable r3, @androidx.annotation.Nullable android.graphics.drawable.Drawable r4) {
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
    }

    public static void setCustomSelectionActionModeCallback(@androidx.annotation.NonNull android.widget.TextView r0, @androidx.annotation.NonNull android.view.ActionMode.Callback r1) {
            android.view.ActionMode$Callback r1 = wrapCustomSelectionActionModeCallback(r0, r1)
            r0.setCustomSelectionActionModeCallback(r1)
            return
    }

    public static void setFirstBaselineToTopHeight(@androidx.annotation.NonNull android.widget.TextView r3, @androidx.annotation.IntRange(from = 0) @androidx.annotation.Px int r4) {
            androidx.core.util.Preconditions.checkArgumentNonnegative(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            androidx.core.widget.TextViewCompat.Api28Impl.setFirstBaselineToTopHeight(r3, r4)
            return
        Ld:
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r1 = r3.getIncludeFontPadding()
            if (r1 == 0) goto L1e
            int r0 = r0.top
            goto L20
        L1e:
            int r0 = r0.ascent
        L20:
            int r1 = java.lang.Math.abs(r0)
            if (r4 <= r1) goto L36
            int r4 = r4 + r0
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingRight()
            int r2 = r3.getPaddingBottom()
            r3.setPadding(r0, r4, r1, r2)
        L36:
            return
    }

    public static void setLastBaselineToBottomHeight(@androidx.annotation.NonNull android.widget.TextView r3, @androidx.annotation.IntRange(from = 0) @androidx.annotation.Px int r4) {
            androidx.core.util.Preconditions.checkArgumentNonnegative(r4)
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r1 = r3.getIncludeFontPadding()
            if (r1 == 0) goto L14
            int r0 = r0.bottom
            goto L16
        L14:
            int r0 = r0.descent
        L16:
            int r1 = java.lang.Math.abs(r0)
            if (r4 <= r1) goto L2c
            int r4 = r4 - r0
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingRight()
            r3.setPadding(r0, r1, r2, r4)
        L2c:
            return
    }

    public static void setLineHeight(@androidx.annotation.NonNull android.widget.TextView r2, @androidx.annotation.IntRange(from = 0) @androidx.annotation.Px int r3) {
            androidx.core.util.Preconditions.checkArgumentNonnegative(r3)
            android.text.TextPaint r0 = r2.getPaint()
            r1 = 0
            int r0 = r0.getFontMetricsInt(r1)
            if (r3 == r0) goto L15
            int r3 = r3 - r0
            float r3 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r3, r0)
        L15:
            return
    }

    public static void setLineHeight(@androidx.annotation.NonNull android.widget.TextView r2, int r3, @androidx.annotation.FloatRange(from = 0.0d) float r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.widget.TextViewCompat.Api34Impl.setLineHeight(r2, r3, r4)
            return
        La:
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r3, r4, r0)
            int r3 = java.lang.Math.round(r3)
            setLineHeight(r2, r3)
            return
    }

    public static void setPrecomputedText(@androidx.annotation.NonNull android.widget.TextView r2, @androidx.annotation.NonNull androidx.core.text.PrecomputedTextCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L12
            android.text.PrecomputedText r3 = r3.getPrecomputedText()
            java.lang.CharSequence r3 = androidx.core.widget.TextViewCompat.Api28Impl.castToCharSequence(r3)
            r2.setText(r3)
            return
        L12:
            androidx.core.text.PrecomputedTextCompat$Params r0 = getTextMetricsParams(r2)
            androidx.core.text.PrecomputedTextCompat$Params r1 = r3.getParams()
            boolean r0 = r0.equalsWithoutTextDirection(r1)
            if (r0 == 0) goto L24
            r2.setText(r3)
            return
        L24:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Given text can not be applied to TextView."
            r2.<init>(r3)
            throw r2
    }

    public static void setTextAppearance(@androidx.annotation.NonNull android.widget.TextView r2, @androidx.annotation.StyleRes int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            androidx.core.widget.e.a(r2, r3)
            return
        La:
            android.content.Context r0 = r2.getContext()
            r2.setTextAppearance(r0, r3)
            return
    }

    public static void setTextMetricsParams(@androidx.annotation.NonNull android.widget.TextView r2, @androidx.annotation.NonNull androidx.core.text.PrecomputedTextCompat.Params r3) {
            android.text.TextDirectionHeuristic r0 = r3.getTextDirection()
            int r0 = getTextDirection(r0)
            r2.setTextDirection(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L3a
            android.text.TextPaint r0 = r3.getTextPaint()
            float r0 = r0.getTextScaleX()
            android.text.TextPaint r1 = r2.getPaint()
            android.text.TextPaint r3 = r3.getTextPaint()
            r1.set(r3)
            float r3 = r2.getTextScaleX()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L36
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r0 / r3
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r1
            r2.setTextScaleX(r3)
        L36:
            r2.setTextScaleX(r0)
            return
        L3a:
            android.text.TextPaint r0 = r2.getPaint()
            android.text.TextPaint r1 = r3.getTextPaint()
            r0.set(r1)
            int r0 = r3.getBreakStrategy()
            androidx.core.widget.TextViewCompat.Api23Impl.setBreakStrategy(r2, r0)
            int r3 = r3.getHyphenationFrequency()
            androidx.core.widget.TextViewCompat.Api23Impl.setHyphenationFrequency(r2, r3)
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static android.view.ActionMode.Callback unwrapCustomSelectionActionModeCallback(@androidx.annotation.Nullable android.view.ActionMode.Callback r2) {
            boolean r0 = r2 instanceof androidx.core.widget.TextViewCompat.OreoCallback
            if (r0 == 0) goto L10
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L10
            androidx.core.widget.TextViewCompat$OreoCallback r2 = (androidx.core.widget.TextViewCompat.OreoCallback) r2
            android.view.ActionMode$Callback r2 = r2.getWrappedCallback()
        L10:
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static android.view.ActionMode.Callback wrapCustomSelectionActionModeCallback(@androidx.annotation.NonNull android.widget.TextView r2, @androidx.annotation.Nullable android.view.ActionMode.Callback r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            r1 = 27
            if (r0 > r1) goto L17
            boolean r0 = r3 instanceof androidx.core.widget.TextViewCompat.OreoCallback
            if (r0 != 0) goto L17
            if (r3 != 0) goto L11
            goto L17
        L11:
            androidx.core.widget.TextViewCompat$OreoCallback r0 = new androidx.core.widget.TextViewCompat$OreoCallback
            r0.<init>(r3, r2)
            return r0
        L17:
            return r3
    }
}
