package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.navigation.Navigator.Name("activity")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ActivityNavigator extends androidx.navigation.Navigator<androidx.navigation.ActivityNavigator.Destination> {
    private static final java.lang.String EXTRA_NAV_CURRENT = "android-support-navigation:ActivityNavigator:current";
    private static final java.lang.String EXTRA_NAV_SOURCE = "android-support-navigation:ActivityNavigator:source";
    private static final java.lang.String EXTRA_POP_ENTER_ANIM = "android-support-navigation:ActivityNavigator:popEnterAnim";
    private static final java.lang.String EXTRA_POP_EXIT_ANIM = "android-support-navigation:ActivityNavigator:popExitAnim";
    private static final java.lang.String LOG_TAG = "ActivityNavigator";
    private android.content.Context mContext;
    private android.app.Activity mHostActivity;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.navigation.NavDestination.ClassType(android.app.Activity.class)
    public static class Destination extends androidx.navigation.NavDestination {
        private java.lang.String mDataPattern;
        private android.content.Intent mIntent;

        public Destination(@androidx.annotation.NonNull androidx.navigation.Navigator<? extends androidx.navigation.ActivityNavigator.Destination> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public Destination(@androidx.annotation.NonNull androidx.navigation.NavigatorProvider r2) {
                r1 = this;
                java.lang.Class<androidx.navigation.ActivityNavigator> r0 = androidx.navigation.ActivityNavigator.class
                androidx.navigation.Navigator r2 = r2.getNavigator(r0)
                r1.<init>(r2)
                return
        }

        @androidx.annotation.Nullable
        public final java.lang.String getAction() {
                r1 = this;
                android.content.Intent r0 = r1.mIntent
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getAction()
                return r0
        }

        @androidx.annotation.Nullable
        public final android.content.ComponentName getComponent() {
                r1 = this;
                android.content.Intent r0 = r1.mIntent
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                android.content.ComponentName r0 = r0.getComponent()
                return r0
        }

        @androidx.annotation.Nullable
        public final android.net.Uri getData() {
                r1 = this;
                android.content.Intent r0 = r1.mIntent
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                android.net.Uri r0 = r0.getData()
                return r0
        }

        @androidx.annotation.Nullable
        public final java.lang.String getDataPattern() {
                r1 = this;
                java.lang.String r0 = r1.mDataPattern
                return r0
        }

        @androidx.annotation.Nullable
        public final android.content.Intent getIntent() {
                r1 = this;
                android.content.Intent r0 = r1.mIntent
                return r0
        }

        @androidx.annotation.Nullable
        public final java.lang.String getTargetPackage() {
                r1 = this;
                android.content.Intent r0 = r1.mIntent
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getPackage()
                return r0
        }

        @Override // androidx.navigation.NavDestination
        @androidx.annotation.CallSuper
        public void onInflate(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull android.util.AttributeSet r5) {
                r3 = this;
                super.onInflate(r4, r5)
                android.content.res.Resources r0 = r4.getResources()
                int[] r1 = androidx.navigation.R.styleable.ActivityNavigator
                android.content.res.TypedArray r5 = r0.obtainAttributes(r5, r1)
                int r0 = androidx.navigation.R.styleable.ActivityNavigator_targetPackage
                java.lang.String r0 = r5.getString(r0)
                if (r0 == 0) goto L1f
                java.lang.String r1 = "${applicationId}"
                java.lang.String r2 = r4.getPackageName()
                java.lang.String r0 = r0.replace(r1, r2)
            L1f:
                r3.setTargetPackage(r0)
                int r0 = androidx.navigation.R.styleable.ActivityNavigator_android_name
                java.lang.String r0 = r5.getString(r0)
                if (r0 == 0) goto L4e
                r1 = 0
                char r1 = r0.charAt(r1)
                r2 = 46
                if (r1 != r2) goto L46
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r4.getPackageName()
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
            L46:
                android.content.ComponentName r1 = new android.content.ComponentName
                r1.<init>(r4, r0)
                r3.setComponentName(r1)
            L4e:
                int r4 = androidx.navigation.R.styleable.ActivityNavigator_action
                java.lang.String r4 = r5.getString(r4)
                r3.setAction(r4)
                int r4 = androidx.navigation.R.styleable.ActivityNavigator_data
                java.lang.String r4 = r5.getString(r4)
                if (r4 == 0) goto L66
                android.net.Uri r4 = android.net.Uri.parse(r4)
                r3.setData(r4)
            L66:
                int r4 = androidx.navigation.R.styleable.ActivityNavigator_dataPattern
                java.lang.String r4 = r5.getString(r4)
                r3.setDataPattern(r4)
                r5.recycle()
                return
        }

        @androidx.annotation.NonNull
        public final androidx.navigation.ActivityNavigator.Destination setAction(@androidx.annotation.Nullable java.lang.String r2) {
                r1 = this;
                android.content.Intent r0 = r1.mIntent
                if (r0 != 0) goto Lb
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r1.mIntent = r0
            Lb:
                android.content.Intent r0 = r1.mIntent
                r0.setAction(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public final androidx.navigation.ActivityNavigator.Destination setComponentName(@androidx.annotation.Nullable android.content.ComponentName r2) {
                r1 = this;
                android.content.Intent r0 = r1.mIntent
                if (r0 != 0) goto Lb
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r1.mIntent = r0
            Lb:
                android.content.Intent r0 = r1.mIntent
                r0.setComponent(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public final androidx.navigation.ActivityNavigator.Destination setData(@androidx.annotation.Nullable android.net.Uri r2) {
                r1 = this;
                android.content.Intent r0 = r1.mIntent
                if (r0 != 0) goto Lb
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r1.mIntent = r0
            Lb:
                android.content.Intent r0 = r1.mIntent
                r0.setData(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public final androidx.navigation.ActivityNavigator.Destination setDataPattern(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.mDataPattern = r1
                return r0
        }

        @androidx.annotation.NonNull
        public final androidx.navigation.ActivityNavigator.Destination setIntent(@androidx.annotation.Nullable android.content.Intent r1) {
                r0 = this;
                r0.mIntent = r1
                return r0
        }

        @androidx.annotation.NonNull
        public final androidx.navigation.ActivityNavigator.Destination setTargetPackage(@androidx.annotation.Nullable java.lang.String r2) {
                r1 = this;
                android.content.Intent r0 = r1.mIntent
                if (r0 != 0) goto Lb
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r1.mIntent = r0
            Lb:
                android.content.Intent r0 = r1.mIntent
                r0.setPackage(r2)
                return r1
        }

        @Override // androidx.navigation.NavDestination
        boolean supportsActions() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.navigation.NavDestination
        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r3 = this;
                android.content.ComponentName r0 = r3.getComponent()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = super.toString()
                r1.append(r2)
                if (r0 == 0) goto L1f
                java.lang.String r2 = " class="
                r1.append(r2)
                java.lang.String r0 = r0.getClassName()
                r1.append(r0)
                goto L2d
            L1f:
                java.lang.String r0 = r3.getAction()
                if (r0 == 0) goto L2d
                java.lang.String r2 = " action="
                r1.append(r2)
                r1.append(r0)
            L2d:
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Extras implements androidx.navigation.Navigator.Extras {
        private final androidx.core.app.ActivityOptionsCompat mActivityOptions;
        private final int mFlags;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class Builder {
            private androidx.core.app.ActivityOptionsCompat mActivityOptions;
            private int mFlags;

            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @androidx.annotation.NonNull
            public androidx.navigation.ActivityNavigator.Extras.Builder addFlags(int r2) {
                    r1 = this;
                    int r0 = r1.mFlags
                    r2 = r2 | r0
                    r1.mFlags = r2
                    return r1
            }

            @androidx.annotation.NonNull
            public androidx.navigation.ActivityNavigator.Extras build() {
                    r3 = this;
                    androidx.navigation.ActivityNavigator$Extras r0 = new androidx.navigation.ActivityNavigator$Extras
                    int r1 = r3.mFlags
                    androidx.core.app.ActivityOptionsCompat r2 = r3.mActivityOptions
                    r0.<init>(r1, r2)
                    return r0
            }

            @androidx.annotation.NonNull
            public androidx.navigation.ActivityNavigator.Extras.Builder setActivityOptions(@androidx.annotation.NonNull androidx.core.app.ActivityOptionsCompat r1) {
                    r0 = this;
                    r0.mActivityOptions = r1
                    return r0
            }
        }

        Extras(int r1, @androidx.annotation.Nullable androidx.core.app.ActivityOptionsCompat r2) {
                r0 = this;
                r0.<init>()
                r0.mFlags = r1
                r0.mActivityOptions = r2
                return
        }

        @androidx.annotation.Nullable
        public androidx.core.app.ActivityOptionsCompat getActivityOptions() {
                r1 = this;
                androidx.core.app.ActivityOptionsCompat r0 = r1.mActivityOptions
                return r0
        }

        public int getFlags() {
                r1 = this;
                int r0 = r1.mFlags
                return r0
        }
    }

    public ActivityNavigator(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.mContext = r2
        L5:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L19
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L12
            android.app.Activity r2 = (android.app.Activity) r2
            r1.mHostActivity = r2
            return
        L12:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L5
        L19:
            return
    }

    public static void applyPopAnimationsToPendingTransition(@androidx.annotation.NonNull android.app.Activity r4) {
            android.content.Intent r0 = r4.getIntent()
            if (r0 != 0) goto L7
            goto L19
        L7:
            java.lang.String r1 = "android-support-navigation:ActivityNavigator:popEnterAnim"
            r2 = -1
            int r1 = r0.getIntExtra(r1, r2)
            java.lang.String r3 = "android-support-navigation:ActivityNavigator:popExitAnim"
            int r0 = r0.getIntExtra(r3, r2)
            if (r1 != r2) goto L1a
            if (r0 == r2) goto L19
            goto L1a
        L19:
            return
        L1a:
            r3 = 0
            if (r1 == r2) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r0 == r2) goto L22
            goto L23
        L22:
            r0 = 0
        L23:
            r4.overridePendingTransition(r1, r0)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.Navigator
    @androidx.annotation.NonNull
    public androidx.navigation.ActivityNavigator.Destination createDestination() {
            r1 = this;
            androidx.navigation.ActivityNavigator$Destination r0 = new androidx.navigation.ActivityNavigator$Destination
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.navigation.Navigator
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.navigation.ActivityNavigator.Destination createDestination() {
            r1 = this;
            androidx.navigation.ActivityNavigator$Destination r0 = r1.createDestination()
            return r0
    }

    @androidx.annotation.NonNull
    final android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    @androidx.annotation.Nullable
    /* renamed from: navigate, reason: avoid collision after fix types in other method */
    public androidx.navigation.NavDestination navigate2(@androidx.annotation.NonNull androidx.navigation.ActivityNavigator.Destination r8, @androidx.annotation.Nullable android.os.Bundle r9, @androidx.annotation.Nullable androidx.navigation.NavOptions r10, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r11) {
            r7 = this;
            android.content.Intent r0 = r8.getIntent()
            if (r0 == 0) goto L16f
            android.content.Intent r0 = new android.content.Intent
            android.content.Intent r1 = r8.getIntent()
            r0.<init>(r1)
            if (r9 == 0) goto L88
            r0.putExtras(r9)
            java.lang.String r1 = r8.getDataPattern()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L88
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "\\{(.+?)\\}"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r3 = r3.matcher(r1)
        L2d:
            boolean r4 = r3.find()
            if (r4 == 0) goto L7a
            r4 = 1
            java.lang.String r4 = r3.group(r4)
            boolean r5 = r9.containsKey(r4)
            if (r5 == 0) goto L53
            java.lang.String r5 = ""
            r3.appendReplacement(r2, r5)
            java.lang.Object r4 = r9.get(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = android.net.Uri.encode(r4)
            r2.append(r4)
            goto L2d
        L53:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Could not find "
            r10.append(r11)
            r10.append(r4)
            java.lang.String r11 = " in "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = " to fill data pattern "
            r10.append(r9)
            r10.append(r1)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L7a:
            r3.appendTail(r2)
            java.lang.String r9 = r2.toString()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r0.setData(r9)
        L88:
            boolean r9 = r11 instanceof androidx.navigation.ActivityNavigator.Extras
            if (r9 == 0) goto L96
            r1 = r11
            androidx.navigation.ActivityNavigator$Extras r1 = (androidx.navigation.ActivityNavigator.Extras) r1
            int r1 = r1.getFlags()
            r0.addFlags(r1)
        L96:
            android.content.Context r1 = r7.mContext
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 != 0) goto La1
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
        La1:
            if (r10 == 0) goto Lae
            boolean r1 = r10.shouldLaunchSingleTop()
            if (r1 == 0) goto Lae
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0.addFlags(r1)
        Lae:
            android.app.Activity r1 = r7.mHostActivity
            java.lang.String r2 = "android-support-navigation:ActivityNavigator:current"
            r3 = 0
            if (r1 == 0) goto Lc6
            android.content.Intent r1 = r1.getIntent()
            if (r1 == 0) goto Lc6
            int r1 = r1.getIntExtra(r2, r3)
            if (r1 == 0) goto Lc6
            java.lang.String r4 = "android-support-navigation:ActivityNavigator:source"
            r0.putExtra(r4, r1)
        Lc6:
            int r1 = r8.getId()
            r0.putExtra(r2, r1)
            android.content.Context r1 = r7.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r2 = "animator"
            if (r10 == 0) goto L10d
            int r4 = r10.getPopEnterAnim()
            int r5 = r10.getPopExitAnim()
            if (r4 <= 0) goto Led
            java.lang.String r6 = r1.getResourceTypeName(r4)
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto Lf9
        Led:
            if (r5 <= 0) goto L103
            java.lang.String r6 = r1.getResourceTypeName(r5)
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L103
        Lf9:
            r1.getResourceName(r4)
            r1.getResourceName(r5)
            r8.toString()
            goto L10d
        L103:
            java.lang.String r6 = "android-support-navigation:ActivityNavigator:popEnterAnim"
            r0.putExtra(r6, r4)
            java.lang.String r4 = "android-support-navigation:ActivityNavigator:popExitAnim"
            r0.putExtra(r4, r5)
        L10d:
            if (r9 == 0) goto L127
            androidx.navigation.ActivityNavigator$Extras r11 = (androidx.navigation.ActivityNavigator.Extras) r11
            androidx.core.app.ActivityOptionsCompat r9 = r11.getActivityOptions()
            if (r9 == 0) goto L121
            android.content.Context r11 = r7.mContext
            android.os.Bundle r9 = r9.toBundle()
            androidx.core.content.ContextCompat.startActivity(r11, r0, r9)
            goto L12c
        L121:
            android.content.Context r9 = r7.mContext
            r9.startActivity(r0)
            goto L12c
        L127:
            android.content.Context r9 = r7.mContext
            r9.startActivity(r0)
        L12c:
            if (r10 == 0) goto L16d
            android.app.Activity r9 = r7.mHostActivity
            if (r9 == 0) goto L16d
            int r9 = r10.getEnterAnim()
            int r10 = r10.getExitAnim()
            if (r9 <= 0) goto L146
            java.lang.String r11 = r1.getResourceTypeName(r9)
            boolean r11 = r11.equals(r2)
            if (r11 != 0) goto L152
        L146:
            if (r10 <= 0) goto L15c
            java.lang.String r11 = r1.getResourceTypeName(r10)
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L15c
        L152:
            r1.getResourceName(r9)
            r1.getResourceName(r10)
            r8.toString()
            goto L16d
        L15c:
            if (r9 >= 0) goto L160
            if (r10 < 0) goto L16d
        L160:
            int r8 = java.lang.Math.max(r9, r3)
            int r9 = java.lang.Math.max(r10, r3)
            android.app.Activity r10 = r7.mHostActivity
            r10.overridePendingTransition(r8, r9)
        L16d:
            r8 = 0
            return r8
        L16f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Destination "
            r10.append(r11)
            int r8 = r8.getId()
            r10.append(r8)
            java.lang.String r8 = " does not have an Intent set."
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
    }

    @Override // androidx.navigation.Navigator
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ androidx.navigation.NavDestination navigate(@androidx.annotation.NonNull androidx.navigation.ActivityNavigator.Destination r1, @androidx.annotation.Nullable android.os.Bundle r2, @androidx.annotation.Nullable androidx.navigation.NavOptions r3, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r4) {
            r0 = this;
            androidx.navigation.ActivityNavigator$Destination r1 = (androidx.navigation.ActivityNavigator.Destination) r1
            androidx.navigation.NavDestination r1 = r0.navigate2(r1, r2, r3, r4)
            return r1
    }

    @Override // androidx.navigation.Navigator
    public boolean popBackStack() {
            r1 = this;
            android.app.Activity r0 = r1.mHostActivity
            if (r0 == 0) goto L9
            r0.finish()
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }
}
