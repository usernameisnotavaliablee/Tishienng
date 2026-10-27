package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavInflater {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final java.lang.String APPLICATION_ID_PLACEHOLDER = "${applicationId}";
    private static final java.lang.String TAG_ACTION = "action";
    private static final java.lang.String TAG_ARGUMENT = "argument";
    private static final java.lang.String TAG_DEEP_LINK = "deepLink";
    private static final java.lang.String TAG_INCLUDE = "include";
    private static final java.lang.ThreadLocal<android.util.TypedValue> sTmpValue = null;
    private android.content.Context mContext;
    private androidx.navigation.NavigatorProvider mNavigatorProvider;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.navigation.NavInflater.sTmpValue = r0
            return
    }

    public NavInflater(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.navigation.NavigatorProvider r2) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mNavigatorProvider = r2
            return
    }

    private static androidx.navigation.NavType checkNavType(android.util.TypedValue r1, androidx.navigation.NavType r2, androidx.navigation.NavType r3, java.lang.String r4, java.lang.String r5) throws org.xmlpull.v1.XmlPullParserException {
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L5
            goto L2e
        L5:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Type is "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = " but found "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = ": "
            r3.append(r4)
            int r1 = r1.data
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L2e:
            if (r2 == 0) goto L31
            return r2
        L31:
            return r3
    }

    @androidx.annotation.NonNull
    private androidx.navigation.NavDestination inflate(@androidx.annotation.NonNull android.content.res.Resources r10, @androidx.annotation.NonNull android.content.res.XmlResourceParser r11, @androidx.annotation.NonNull android.util.AttributeSet r12, int r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r9 = this;
            androidx.navigation.NavigatorProvider r0 = r9.mNavigatorProvider
            java.lang.String r1 = r11.getName()
            androidx.navigation.Navigator r0 = r0.getNavigator(r1)
            androidx.navigation.NavDestination r3 = r0.createDestination()
            android.content.Context r0 = r9.mContext
            r3.onInflate(r0, r12)
            int r0 = r11.getDepth()
            r7 = 1
            int r0 = r0 + r7
        L19:
            int r1 = r11.next()
            if (r1 == r7) goto L29
            int r2 = r11.getDepth()
            if (r2 >= r0) goto L2c
            r4 = 3
            if (r1 == r4) goto L29
            goto L2c
        L29:
            r1 = r9
            goto La5
        L2c:
            r4 = 2
            if (r1 == r4) goto L30
            goto L19
        L30:
            if (r2 <= r0) goto L33
            goto L19
        L33:
            java.lang.String r8 = r11.getName()
            java.lang.String r1 = "argument"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L48
            r9.inflateArgumentForDestination(r10, r3, r12, r13)
        L42:
            r1 = r9
            r2 = r10
            r5 = r11
            r4 = r12
            r6 = r13
            goto L9f
        L48:
            java.lang.String r1 = "deepLink"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L54
            r9.inflateDeepLink(r10, r3, r12)
            goto L42
        L54:
            java.lang.String r1 = "action"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L65
            r1 = r9
            r2 = r10
            r5 = r11
            r4 = r12
            r6 = r13
            r1.inflateAction(r2, r3, r4, r5, r6)
            goto L9f
        L65:
            r1 = r9
            r2 = r10
            r5 = r11
            r4 = r12
            r6 = r13
            java.lang.String r10 = "include"
            boolean r10 = r10.equals(r8)
            if (r10 == 0) goto L91
            boolean r10 = r3 instanceof androidx.navigation.NavGraph
            if (r10 == 0) goto L91
            int[] r10 = androidx.navigation.R.styleable.NavInclude
            android.content.res.TypedArray r10 = r2.obtainAttributes(r4, r10)
            int r11 = androidx.navigation.R.styleable.NavInclude_graph
            r12 = 0
            int r11 = r10.getResourceId(r11, r12)
            r12 = r3
            androidx.navigation.NavGraph r12 = (androidx.navigation.NavGraph) r12
            androidx.navigation.NavGraph r11 = r9.inflate(r11)
            r12.addDestination(r11)
            r10.recycle()
            goto L9f
        L91:
            boolean r10 = r3 instanceof androidx.navigation.NavGraph
            if (r10 == 0) goto L9f
            r10 = r3
            androidx.navigation.NavGraph r10 = (androidx.navigation.NavGraph) r10
            androidx.navigation.NavDestination r11 = r9.inflate(r2, r5, r4, r6)
            r10.addDestination(r11)
        L9f:
            r10 = r2
            r12 = r4
            r11 = r5
            r13 = r6
            goto L19
        La5:
            return r3
    }

    private void inflateAction(@androidx.annotation.NonNull android.content.res.Resources r10, @androidx.annotation.NonNull androidx.navigation.NavDestination r11, @androidx.annotation.NonNull android.util.AttributeSet r12, android.content.res.XmlResourceParser r13, int r14) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            r9 = this;
            int[] r0 = androidx.navigation.common.R.styleable.NavAction
            android.content.res.TypedArray r0 = r10.obtainAttributes(r12, r0)
            int r1 = androidx.navigation.common.R.styleable.NavAction_android_id
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r3 = androidx.navigation.common.R.styleable.NavAction_destination
            int r3 = r0.getResourceId(r3, r2)
            androidx.navigation.NavAction r4 = new androidx.navigation.NavAction
            r4.<init>(r3)
            androidx.navigation.NavOptions$Builder r3 = new androidx.navigation.NavOptions$Builder
            r3.<init>()
            int r5 = androidx.navigation.common.R.styleable.NavAction_launchSingleTop
            boolean r5 = r0.getBoolean(r5, r2)
            r3.setLaunchSingleTop(r5)
            int r5 = androidx.navigation.common.R.styleable.NavAction_popUpTo
            r6 = -1
            int r5 = r0.getResourceId(r5, r6)
            int r7 = androidx.navigation.common.R.styleable.NavAction_popUpToInclusive
            boolean r2 = r0.getBoolean(r7, r2)
            r3.setPopUpTo(r5, r2)
            int r2 = androidx.navigation.common.R.styleable.NavAction_enterAnim
            int r2 = r0.getResourceId(r2, r6)
            r3.setEnterAnim(r2)
            int r2 = androidx.navigation.common.R.styleable.NavAction_exitAnim
            int r2 = r0.getResourceId(r2, r6)
            r3.setExitAnim(r2)
            int r2 = androidx.navigation.common.R.styleable.NavAction_popEnterAnim
            int r2 = r0.getResourceId(r2, r6)
            r3.setPopEnterAnim(r2)
            int r2 = androidx.navigation.common.R.styleable.NavAction_popExitAnim
            int r2 = r0.getResourceId(r2, r6)
            r3.setPopExitAnim(r2)
            androidx.navigation.NavOptions r2 = r3.build()
            r4.setNavOptions(r2)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            int r3 = r13.getDepth()
            r5 = 1
            int r3 = r3 + r5
        L6c:
            int r6 = r13.next()
            if (r6 == r5) goto L92
            int r7 = r13.getDepth()
            if (r7 >= r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L92
        L7b:
            r8 = 2
            if (r6 == r8) goto L7f
            goto L6c
        L7f:
            if (r7 <= r3) goto L82
            goto L6c
        L82:
            java.lang.String r6 = r13.getName()
            java.lang.String r7 = "argument"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L6c
            r9.inflateArgumentForBundle(r10, r2, r12, r14)
            goto L6c
        L92:
            boolean r10 = r2.isEmpty()
            if (r10 != 0) goto L9b
            r4.setDefaultArguments(r2)
        L9b:
            r11.putAction(r1, r4)
            r0.recycle()
            return
    }

    @androidx.annotation.NonNull
    private androidx.navigation.NavArgument inflateArgument(@androidx.annotation.NonNull android.content.res.TypedArray r11, @androidx.annotation.NonNull android.content.res.Resources r12, int r13) throws org.xmlpull.v1.XmlPullParserException {
            r10 = this;
            androidx.navigation.NavArgument$Builder r0 = new androidx.navigation.NavArgument$Builder
            r0.<init>()
            int r1 = androidx.navigation.common.R.styleable.NavArgument_nullable
            r2 = 0
            boolean r1 = r11.getBoolean(r1, r2)
            r0.setIsNullable(r1)
            java.lang.ThreadLocal<android.util.TypedValue> r1 = androidx.navigation.NavInflater.sTmpValue
            java.lang.Object r3 = r1.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L21
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r1.set(r3)
        L21:
            int r1 = androidx.navigation.common.R.styleable.NavArgument_argType
            java.lang.String r1 = r11.getString(r1)
            r4 = 0
            if (r1 == 0) goto L33
            java.lang.String r13 = r12.getResourcePackageName(r13)
            androidx.navigation.NavType r13 = androidx.navigation.NavType.fromArgType(r1, r13)
            goto L34
        L33:
            r13 = r4
        L34:
            int r5 = androidx.navigation.common.R.styleable.NavArgument_android_defaultValue
            boolean r6 = r11.getValue(r5, r3)
            if (r6 == 0) goto L164
            androidx.navigation.NavType<java.lang.Integer> r4 = androidx.navigation.NavType.ReferenceType
            java.lang.String r6 = "' for "
            java.lang.String r7 = "unsupported value '"
            r8 = 16
            if (r13 != r4) goto L84
            int r11 = r3.resourceId
            if (r11 == 0) goto L50
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            goto L164
        L50:
            int r11 = r3.type
            if (r11 != r8) goto L5e
            int r11 = r3.data
            if (r11 != 0) goto L5e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            goto L164
        L5e:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            java.lang.CharSequence r0 = r3.string
            r12.append(r0)
            r12.append(r6)
            java.lang.String r13 = r13.getName()
            r12.append(r13)
            java.lang.String r13 = ". Must be a reference to a resource."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L84:
            int r9 = r3.resourceId
            if (r9 == 0) goto Lc4
            if (r13 != 0) goto L92
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r13 = r4
            r4 = r11
            goto L164
        L92:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            java.lang.CharSequence r0 = r3.string
            r12.append(r0)
            r12.append(r6)
            java.lang.String r13 = r13.getName()
            r12.append(r13)
            java.lang.String r13 = ". You must use a \""
            r12.append(r13)
            java.lang.String r13 = r4.getName()
            r12.append(r13)
            java.lang.String r13 = "\" type to reference other resources."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Lc4:
            androidx.navigation.NavType<java.lang.String> r4 = androidx.navigation.NavType.StringType
            if (r13 != r4) goto Lce
            java.lang.String r4 = r11.getString(r5)
            goto L164
        Lce:
            int r11 = r3.type
            r4 = 3
            if (r11 == r4) goto L154
            r4 = 4
            java.lang.String r5 = "float"
            if (r11 == r4) goto L145
            r4 = 5
            if (r11 == r4) goto L12f
            r12 = 18
            if (r11 == r12) goto L11d
            if (r11 < r8) goto L104
            r12 = 31
            if (r11 > r12) goto L104
            androidx.navigation.NavType<java.lang.Float> r11 = androidx.navigation.NavType.FloatType
            if (r13 != r11) goto Lf5
            androidx.navigation.NavType r13 = checkNavType(r3, r13, r11, r1, r5)
            int r11 = r3.data
            float r11 = (float) r11
            java.lang.Float r4 = java.lang.Float.valueOf(r11)
            goto L164
        Lf5:
            androidx.navigation.NavType<java.lang.Integer> r11 = androidx.navigation.NavType.IntType
            java.lang.String r12 = "integer"
            androidx.navigation.NavType r13 = checkNavType(r3, r13, r11, r1, r12)
            int r11 = r3.data
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            goto L164
        L104:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "unsupported argument type "
            r12.append(r13)
            int r13 = r3.type
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L11d:
            androidx.navigation.NavType<java.lang.Boolean> r11 = androidx.navigation.NavType.BoolType
            java.lang.String r12 = "boolean"
            androidx.navigation.NavType r13 = checkNavType(r3, r13, r11, r1, r12)
            int r11 = r3.data
            if (r11 == 0) goto L12a
            r2 = 1
        L12a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            goto L164
        L12f:
            androidx.navigation.NavType<java.lang.Integer> r11 = androidx.navigation.NavType.IntType
            java.lang.String r2 = "dimension"
            androidx.navigation.NavType r13 = checkNavType(r3, r13, r11, r1, r2)
            android.util.DisplayMetrics r11 = r12.getDisplayMetrics()
            float r11 = r3.getDimension(r11)
            int r11 = (int) r11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            goto L164
        L145:
            androidx.navigation.NavType<java.lang.Float> r11 = androidx.navigation.NavType.FloatType
            androidx.navigation.NavType r13 = checkNavType(r3, r13, r11, r1, r5)
            float r11 = r3.getFloat()
            java.lang.Float r4 = java.lang.Float.valueOf(r11)
            goto L164
        L154:
            java.lang.CharSequence r11 = r3.string
            java.lang.String r11 = r11.toString()
            if (r13 != 0) goto L160
            androidx.navigation.NavType r13 = androidx.navigation.NavType.inferFromValue(r11)
        L160:
            java.lang.Object r4 = r13.parseValue(r11)
        L164:
            if (r4 == 0) goto L169
            r0.setDefaultValue(r4)
        L169:
            if (r13 == 0) goto L16e
            r0.setType(r13)
        L16e:
            androidx.navigation.NavArgument r11 = r0.build()
            return r11
    }

    private void inflateArgumentForBundle(@androidx.annotation.NonNull android.content.res.Resources r2, @androidx.annotation.NonNull android.os.Bundle r3, @androidx.annotation.NonNull android.util.AttributeSet r4, int r5) throws org.xmlpull.v1.XmlPullParserException {
            r1 = this;
            int[] r0 = androidx.navigation.common.R.styleable.NavArgument
            android.content.res.TypedArray r4 = r2.obtainAttributes(r4, r0)
            int r0 = androidx.navigation.common.R.styleable.NavArgument_android_name
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L1f
            androidx.navigation.NavArgument r2 = r1.inflateArgument(r4, r2, r5)
            boolean r5 = r2.isDefaultValuePresent()
            if (r5 == 0) goto L1b
            r2.putDefaultValue(r0, r3)
        L1b:
            r4.recycle()
            return
        L1f:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r3 = "Arguments must have a name"
            r2.<init>(r3)
            throw r2
    }

    private void inflateArgumentForDestination(@androidx.annotation.NonNull android.content.res.Resources r2, @androidx.annotation.NonNull androidx.navigation.NavDestination r3, @androidx.annotation.NonNull android.util.AttributeSet r4, int r5) throws org.xmlpull.v1.XmlPullParserException {
            r1 = this;
            int[] r0 = androidx.navigation.common.R.styleable.NavArgument
            android.content.res.TypedArray r4 = r2.obtainAttributes(r4, r0)
            int r0 = androidx.navigation.common.R.styleable.NavArgument_android_name
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L19
            androidx.navigation.NavArgument r2 = r1.inflateArgument(r4, r2, r5)
            r3.addArgument(r0, r2)
            r4.recycle()
            return
        L19:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r3 = "Arguments must have a name"
            r2.<init>(r3)
            throw r2
    }

    private void inflateDeepLink(@androidx.annotation.NonNull android.content.res.Resources r6, @androidx.annotation.NonNull androidx.navigation.NavDestination r7, @androidx.annotation.NonNull android.util.AttributeSet r8) throws org.xmlpull.v1.XmlPullParserException {
            r5 = this;
            int[] r0 = androidx.navigation.common.R.styleable.NavDeepLink
            android.content.res.TypedArray r6 = r6.obtainAttributes(r8, r0)
            int r8 = androidx.navigation.common.R.styleable.NavDeepLink_uri
            java.lang.String r8 = r6.getString(r8)
            int r0 = androidx.navigation.common.R.styleable.NavDeepLink_action
            java.lang.String r0 = r6.getString(r0)
            int r1 = androidx.navigation.common.R.styleable.NavDeepLink_mimeType
            java.lang.String r1 = r6.getString(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 == 0) goto L33
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L33
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L2b
            goto L33
        L2b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r7 = "Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType"
            r6.<init>(r7)
            throw r6
        L33:
            androidx.navigation.NavDeepLink$Builder r2 = new androidx.navigation.NavDeepLink$Builder
            r2.<init>()
            java.lang.String r3 = "${applicationId}"
            if (r8 == 0) goto L49
            android.content.Context r4 = r5.mContext
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r8 = r8.replace(r3, r4)
            r2.setUriPattern(r8)
        L49:
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 != 0) goto L5c
            android.content.Context r8 = r5.mContext
            java.lang.String r8 = r8.getPackageName()
            java.lang.String r8 = r0.replace(r3, r8)
            r2.setAction(r8)
        L5c:
            if (r1 == 0) goto L6b
            android.content.Context r8 = r5.mContext
            java.lang.String r8 = r8.getPackageName()
            java.lang.String r8 = r1.replace(r3, r8)
            r2.setMimeType(r8)
        L6b:
            androidx.navigation.NavDeepLink r8 = r2.build()
            r7.addDeepLink(r8)
            r6.recycle()
            return
    }

    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"ResourceType"})
    public androidx.navigation.NavGraph inflate(@androidx.annotation.NavigationRes int r7) {
            r6 = this;
            android.content.Context r0 = r6.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        Le:
            int r3 = r1.next()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r4 = 2
            if (r3 == r4) goto L19
            r5 = 1
            if (r3 == r5) goto L19
            goto Le
        L19:
            if (r3 != r4) goto L4d
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            androidx.navigation.NavDestination r2 = r6.inflate(r0, r1, r2, r7)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            boolean r4 = r2 instanceof androidx.navigation.NavGraph     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            if (r4 == 0) goto L31
            androidx.navigation.NavGraph r2 = (androidx.navigation.NavGraph) r2     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r1.close()
            return r2
        L2d:
            r7 = move-exception
            goto L7c
        L2f:
            r2 = move-exception
            goto L55
        L31:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r4.<init>()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.lang.String r5 = "Root element <"
            r4.append(r5)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r4.append(r3)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r4.append(r3)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            throw r2     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
        L4d:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            throw r2     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
        L55:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r4.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r7 = r0.getResourceName(r7)     // Catch: java.lang.Throwable -> L2d
            r4.append(r7)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch: java.lang.Throwable -> L2d
            int r7 = r1.getLineNumber()     // Catch: java.lang.Throwable -> L2d
            r4.append(r7)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r7, r2)     // Catch: java.lang.Throwable -> L2d
            throw r3     // Catch: java.lang.Throwable -> L2d
        L7c:
            r1.close()
            throw r7
    }
}
