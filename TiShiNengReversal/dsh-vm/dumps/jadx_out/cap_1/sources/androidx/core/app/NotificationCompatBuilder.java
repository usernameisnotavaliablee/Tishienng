package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class NotificationCompatBuilder implements androidx.core.app.NotificationBuilderWithBuilderAccessor {
    private final java.util.List<android.os.Bundle> mActionExtrasList;
    private android.widget.RemoteViews mBigContentView;
    private final android.app.Notification.Builder mBuilder;
    private final androidx.core.app.NotificationCompat.Builder mBuilderCompat;
    private android.widget.RemoteViews mContentView;
    private final android.content.Context mContext;
    private final android.os.Bundle mExtras;
    private int mGroupAlertBehavior;
    private android.widget.RemoteViews mHeadsUpContentView;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(20)
    static class Api20Impl {
        private Api20Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder addAction(android.app.Notification.Builder r0, android.app.Notification.Action r1) {
                android.app.Notification$Builder r0 = r0.addAction(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Action.Builder addExtras(android.app.Notification.Action.Builder r0, android.os.Bundle r1) {
                android.app.Notification$Action$Builder r0 = r0.addExtras(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Action.Builder addRemoteInput(android.app.Notification.Action.Builder r0, android.app.RemoteInput r1) {
                android.app.Notification$Action$Builder r0 = r0.addRemoteInput(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Action build(android.app.Notification.Action.Builder r0) {
                android.app.Notification$Action r0 = r0.build()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Action.Builder createBuilder(int r1, java.lang.CharSequence r2, android.app.PendingIntent r3) {
                android.app.Notification$Action$Builder r0 = new android.app.Notification$Action$Builder
                r0.<init>(r1, r2, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getGroup(android.app.Notification r0) {
                java.lang.String r0 = r0.getGroup()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setGroup(android.app.Notification.Builder r0, java.lang.String r1) {
                android.app.Notification$Builder r0 = r0.setGroup(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setGroupSummary(android.app.Notification.Builder r0, boolean r1) {
                android.app.Notification$Builder r0 = r0.setGroupSummary(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setLocalOnly(android.app.Notification.Builder r0, boolean r1) {
                android.app.Notification$Builder r0 = r0.setLocalOnly(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setSortKey(android.app.Notification.Builder r0, java.lang.String r1) {
                android.app.Notification$Builder r0 = r0.setSortKey(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder addPerson(android.app.Notification.Builder r0, java.lang.String r1) {
                android.app.Notification$Builder r0 = r0.addPerson(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setCategory(android.app.Notification.Builder r0, java.lang.String r1) {
                android.app.Notification$Builder r0 = r0.setCategory(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setColor(android.app.Notification.Builder r0, int r1) {
                android.app.Notification$Builder r0 = r0.setColor(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setPublicVersion(android.app.Notification.Builder r0, android.app.Notification r1) {
                android.app.Notification$Builder r0 = r0.setPublicVersion(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setSound(android.app.Notification.Builder r0, android.net.Uri r1, java.lang.Object r2) {
                android.media.AudioAttributes r2 = (android.media.AudioAttributes) r2
                android.app.Notification$Builder r0 = r0.setSound(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setVisibility(android.app.Notification.Builder r0, int r1) {
                android.app.Notification$Builder r0 = r0.setVisibility(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Action.Builder createBuilder(android.graphics.drawable.Icon r1, java.lang.CharSequence r2, android.app.PendingIntent r3) {
                android.app.Notification$Action$Builder r0 = new android.app.Notification$Action$Builder
                r0.<init>(r1, r2, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setLargeIcon(android.app.Notification.Builder r0, android.graphics.drawable.Icon r1) {
                android.app.Notification$Builder r0 = r0.setLargeIcon(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setSmallIcon(android.app.Notification.Builder r0, java.lang.Object r1) {
                android.graphics.drawable.Icon r1 = (android.graphics.drawable.Icon) r1
                android.app.Notification$Builder r0 = r0.setSmallIcon(r1)
                return r0
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
        static android.app.Notification.Action.Builder setAllowGeneratedReplies(android.app.Notification.Action.Builder r0, boolean r1) {
                android.app.Notification$Action$Builder r0 = r0.setAllowGeneratedReplies(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setCustomBigContentView(android.app.Notification.Builder r0, android.widget.RemoteViews r1) {
                android.app.Notification$Builder r0 = r0.setCustomBigContentView(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setCustomContentView(android.app.Notification.Builder r0, android.widget.RemoteViews r1) {
                android.app.Notification$Builder r0 = r0.setCustomContentView(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setCustomHeadsUpContentView(android.app.Notification.Builder r0, android.widget.RemoteViews r1) {
                android.app.Notification$Builder r0 = r0.setCustomHeadsUpContentView(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setRemoteInputHistory(android.app.Notification.Builder r0, java.lang.CharSequence[] r1) {
                android.app.Notification$Builder r0 = r0.setRemoteInputHistory(r1)
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
        static android.app.Notification.Builder createBuilder(android.content.Context r1, java.lang.String r2) {
                android.app.Notification$Builder r0 = new android.app.Notification$Builder
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setBadgeIconType(android.app.Notification.Builder r0, int r1) {
                android.app.Notification$Builder r0 = r0.setBadgeIconType(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setColorized(android.app.Notification.Builder r0, boolean r1) {
                android.app.Notification$Builder r0 = r0.setColorized(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setGroupAlertBehavior(android.app.Notification.Builder r0, int r1) {
                android.app.Notification$Builder r0 = r0.setGroupAlertBehavior(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setSettingsText(android.app.Notification.Builder r0, java.lang.CharSequence r1) {
                android.app.Notification$Builder r0 = r0.setSettingsText(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setShortcutId(android.app.Notification.Builder r0, java.lang.String r1) {
                android.app.Notification$Builder r0 = r0.setShortcutId(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setTimeoutAfter(android.app.Notification.Builder r0, long r1) {
                android.app.Notification$Builder r0 = r0.setTimeoutAfter(r1)
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
        static android.app.Notification.Builder addPerson(android.app.Notification.Builder r0, android.app.Person r1) {
                android.app.Notification$Builder r0 = r0.addPerson(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Action.Builder setSemanticAction(android.app.Notification.Action.Builder r0, int r1) {
                android.app.Notification$Action$Builder r0 = r0.setSemanticAction(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setAllowSystemGeneratedContextualActions(android.app.Notification.Builder r0, boolean r1) {
                android.app.Notification$Builder r0 = r0.setAllowSystemGeneratedContextualActions(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setBubbleMetadata(android.app.Notification.Builder r0, android.app.Notification.BubbleMetadata r1) {
                android.app.Notification$Builder r0 = r0.setBubbleMetadata(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Action.Builder setContextual(android.app.Notification.Action.Builder r0, boolean r1) {
                android.app.Notification$Action$Builder r0 = r0.setContextual(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setLocusId(android.app.Notification.Builder r0, java.lang.Object r1) {
                android.content.LocusId r1 = (android.content.LocusId) r1
                android.app.Notification$Builder r0 = r0.setLocusId(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(31)
    static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Action.Builder setAuthenticationRequired(android.app.Notification.Action.Builder r0, boolean r1) {
                android.app.Notification$Action$Builder r0 = r0.setAuthenticationRequired(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.Notification.Builder setForegroundServiceBehavior(android.app.Notification.Builder r0, int r1) {
                android.app.Notification$Builder r0 = r0.setForegroundServiceBehavior(r1)
                return r0
        }
    }

    NotificationCompatBuilder(androidx.core.app.NotificationCompat.Builder r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mActionExtrasList = r2
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r0.mExtras = r2
            r0.mBuilderCompat = r1
            android.content.Context r2 = r1.mContext
            r0.mContext = r2
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L2a
            java.lang.String r5 = r1.mChannelId
            android.app.Notification$Builder r5 = androidx.core.app.NotificationCompatBuilder.Api26Impl.createBuilder(r2, r5)
            r0.mBuilder = r5
            goto L33
        L2a:
            android.app.Notification$Builder r5 = new android.app.Notification$Builder
            android.content.Context r6 = r1.mContext
            r5.<init>(r6)
            r0.mBuilder = r5
        L33:
            android.app.Notification r5 = r1.mNotification
            android.app.Notification$Builder r6 = r0.mBuilder
            long r7 = r5.when
            android.app.Notification$Builder r6 = r6.setWhen(r7)
            int r7 = r5.icon
            int r8 = r5.iconLevel
            android.app.Notification$Builder r6 = r6.setSmallIcon(r7, r8)
            android.widget.RemoteViews r7 = r5.contentView
            android.app.Notification$Builder r6 = r6.setContent(r7)
            java.lang.CharSequence r7 = r5.tickerText
            android.widget.RemoteViews r8 = r1.mTickerView
            android.app.Notification$Builder r6 = r6.setTicker(r7, r8)
            long[] r7 = r5.vibrate
            android.app.Notification$Builder r6 = r6.setVibrate(r7)
            int r7 = r5.ledARGB
            int r8 = r5.ledOnMS
            int r9 = r5.ledOffMS
            android.app.Notification$Builder r6 = r6.setLights(r7, r8, r9)
            int r7 = r5.flags
            r8 = 2
            r7 = r7 & r8
            r10 = 0
            if (r7 == 0) goto L6c
            r7 = 1
            goto L6d
        L6c:
            r7 = 0
        L6d:
            android.app.Notification$Builder r6 = r6.setOngoing(r7)
            int r7 = r5.flags
            r7 = r7 & 8
            if (r7 == 0) goto L79
            r7 = 1
            goto L7a
        L79:
            r7 = 0
        L7a:
            android.app.Notification$Builder r6 = r6.setOnlyAlertOnce(r7)
            int r7 = r5.flags
            r7 = r7 & 16
            if (r7 == 0) goto L86
            r7 = 1
            goto L87
        L86:
            r7 = 0
        L87:
            android.app.Notification$Builder r6 = r6.setAutoCancel(r7)
            int r7 = r5.defaults
            android.app.Notification$Builder r6 = r6.setDefaults(r7)
            java.lang.CharSequence r7 = r1.mContentTitle
            android.app.Notification$Builder r6 = r6.setContentTitle(r7)
            java.lang.CharSequence r7 = r1.mContentText
            android.app.Notification$Builder r6 = r6.setContentText(r7)
            java.lang.CharSequence r7 = r1.mContentInfo
            android.app.Notification$Builder r6 = r6.setContentInfo(r7)
            android.app.PendingIntent r7 = r1.mContentIntent
            android.app.Notification$Builder r6 = r6.setContentIntent(r7)
            android.app.PendingIntent r7 = r5.deleteIntent
            android.app.Notification$Builder r6 = r6.setDeleteIntent(r7)
            android.app.PendingIntent r7 = r1.mFullScreenIntent
            int r11 = r5.flags
            r11 = r11 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto Lb9
            r11 = 1
            goto Lba
        Lb9:
            r11 = 0
        Lba:
            android.app.Notification$Builder r6 = r6.setFullScreenIntent(r7, r11)
            int r7 = r1.mNumber
            android.app.Notification$Builder r6 = r6.setNumber(r7)
            int r7 = r1.mProgressMax
            int r11 = r1.mProgress
            boolean r12 = r1.mProgressIndeterminate
            r6.setProgress(r7, r11, r12)
            r6 = 23
            r7 = 0
            if (r3 >= r6) goto Le2
            android.app.Notification$Builder r2 = r0.mBuilder
            androidx.core.graphics.drawable.IconCompat r3 = r1.mLargeIcon
            if (r3 != 0) goto Lda
            r3 = r7
            goto Lde
        Lda:
            android.graphics.Bitmap r3 = r3.getBitmap()
        Lde:
            r2.setLargeIcon(r3)
            goto Lf1
        Le2:
            android.app.Notification$Builder r3 = r0.mBuilder
            androidx.core.graphics.drawable.IconCompat r11 = r1.mLargeIcon
            if (r11 != 0) goto Lea
            r2 = r7
            goto Lee
        Lea:
            android.graphics.drawable.Icon r2 = r11.toIcon(r2)
        Lee:
            androidx.core.app.NotificationCompatBuilder.Api23Impl.setLargeIcon(r3, r2)
        Lf1:
            android.app.Notification$Builder r2 = r0.mBuilder
            java.lang.CharSequence r3 = r1.mSubText
            android.app.Notification$Builder r2 = r2.setSubText(r3)
            boolean r3 = r1.mUseChronometer
            android.app.Notification$Builder r2 = r2.setUsesChronometer(r3)
            int r3 = r1.mPriority
            r2.setPriority(r3)
            androidx.core.app.NotificationCompat$Style r2 = r1.mStyle
            boolean r3 = r2 instanceof androidx.core.app.NotificationCompat.CallStyle
            if (r3 == 0) goto L124
            androidx.core.app.NotificationCompat$CallStyle r2 = (androidx.core.app.NotificationCompat.CallStyle) r2
            java.util.ArrayList r2 = r2.getActionsListWithSystemActions()
            java.util.Iterator r2 = r2.iterator()
        L114:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L13a
            java.lang.Object r3 = r2.next()
            androidx.core.app.NotificationCompat$Action r3 = (androidx.core.app.NotificationCompat.Action) r3
            r0.addAction(r3)
            goto L114
        L124:
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r2 = r1.mActions
            java.util.Iterator r2 = r2.iterator()
        L12a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L13a
            java.lang.Object r3 = r2.next()
            androidx.core.app.NotificationCompat$Action r3 = (androidx.core.app.NotificationCompat.Action) r3
            r0.addAction(r3)
            goto L12a
        L13a:
            android.os.Bundle r2 = r1.mExtras
            if (r2 == 0) goto L143
            android.os.Bundle r3 = r0.mExtras
            r3.putAll(r2)
        L143:
            int r2 = android.os.Build.VERSION.SDK_INT
            android.widget.RemoteViews r3 = r1.mContentView
            r0.mContentView = r3
            android.widget.RemoteViews r3 = r1.mBigContentView
            r0.mBigContentView = r3
            android.app.Notification$Builder r3 = r0.mBuilder
            boolean r11 = r1.mShowWhen
            r3.setShowWhen(r11)
            android.app.Notification$Builder r3 = r0.mBuilder
            boolean r11 = r1.mLocalOnly
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setLocalOnly(r3, r11)
            android.app.Notification$Builder r3 = r0.mBuilder
            java.lang.String r11 = r1.mGroupKey
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setGroup(r3, r11)
            android.app.Notification$Builder r3 = r0.mBuilder
            java.lang.String r11 = r1.mSortKey
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setSortKey(r3, r11)
            android.app.Notification$Builder r3 = r0.mBuilder
            boolean r11 = r1.mGroupSummary
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setGroupSummary(r3, r11)
            int r3 = r1.mGroupAlertBehavior
            r0.mGroupAlertBehavior = r3
            android.app.Notification$Builder r3 = r0.mBuilder
            java.lang.String r11 = r1.mCategory
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setCategory(r3, r11)
            android.app.Notification$Builder r3 = r0.mBuilder
            int r11 = r1.mColor
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setColor(r3, r11)
            android.app.Notification$Builder r3 = r0.mBuilder
            int r11 = r1.mVisibility
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setVisibility(r3, r11)
            android.app.Notification$Builder r3 = r0.mBuilder
            android.app.Notification r11 = r1.mPublicVersion
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setPublicVersion(r3, r11)
            android.app.Notification$Builder r3 = r0.mBuilder
            android.net.Uri r11 = r5.sound
            android.media.AudioAttributes r12 = r5.audioAttributes
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setSound(r3, r11, r12)
            r3 = 28
            if (r2 >= r3) goto L1aa
            java.util.ArrayList<androidx.core.app.Person> r2 = r1.mPersonList
            java.util.List r2 = getPeople(r2)
            java.util.ArrayList<java.lang.String> r11 = r1.mPeople
            java.util.List r2 = combineLists(r2, r11)
            goto L1ac
        L1aa:
            java.util.ArrayList<java.lang.String> r2 = r1.mPeople
        L1ac:
            if (r2 == 0) goto L1ca
            boolean r11 = r2.isEmpty()
            if (r11 != 0) goto L1ca
            java.util.Iterator r2 = r2.iterator()
        L1b8:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L1ca
            java.lang.Object r11 = r2.next()
            java.lang.String r11 = (java.lang.String) r11
            android.app.Notification$Builder r12 = r0.mBuilder
            androidx.core.app.NotificationCompatBuilder.Api21Impl.addPerson(r12, r11)
            goto L1b8
        L1ca:
            android.widget.RemoteViews r2 = r1.mHeadsUpContentView
            r0.mHeadsUpContentView = r2
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r2 = r1.mInvisibleActions
            int r2 = r2.size()
            if (r2 <= 0) goto L224
            android.os.Bundle r2 = r1.getExtras()
            java.lang.String r11 = "android.car.EXTENSIONS"
            android.os.Bundle r2 = r2.getBundle(r11)
            if (r2 != 0) goto L1e7
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L1e7:
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>(r2)
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            r14 = 0
        L1f2:
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r15 = r1.mInvisibleActions
            int r15 = r15.size()
            if (r14 >= r15) goto L210
            java.lang.String r15 = java.lang.Integer.toString(r14)
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r9 = r1.mInvisibleActions
            java.lang.Object r9 = r9.get(r14)
            androidx.core.app.NotificationCompat$Action r9 = (androidx.core.app.NotificationCompat.Action) r9
            android.os.Bundle r9 = androidx.core.app.NotificationCompatJellybean.getBundleForAction(r9)
            r13.putBundle(r15, r9)
            int r14 = r14 + 1
            goto L1f2
        L210:
            java.lang.String r9 = "invisible_actions"
            r2.putBundle(r9, r13)
            r12.putBundle(r9, r13)
            android.os.Bundle r9 = r1.getExtras()
            r9.putBundle(r11, r2)
            android.os.Bundle r2 = r0.mExtras
            r2.putBundle(r11, r12)
        L224:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r6) goto L231
            java.lang.Object r6 = r1.mSmallIcon
            if (r6 == 0) goto L231
            android.app.Notification$Builder r9 = r0.mBuilder
            androidx.core.app.NotificationCompatBuilder.Api23Impl.setSmallIcon(r9, r6)
        L231:
            r6 = 24
            if (r2 < r6) goto L25e
            android.app.Notification$Builder r6 = r0.mBuilder
            android.os.Bundle r9 = r1.mExtras
            r6.setExtras(r9)
            android.app.Notification$Builder r6 = r0.mBuilder
            java.lang.CharSequence[] r9 = r1.mRemoteInputHistory
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setRemoteInputHistory(r6, r9)
            android.widget.RemoteViews r6 = r1.mContentView
            if (r6 == 0) goto L24c
            android.app.Notification$Builder r9 = r0.mBuilder
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setCustomContentView(r9, r6)
        L24c:
            android.widget.RemoteViews r6 = r1.mBigContentView
            if (r6 == 0) goto L255
            android.app.Notification$Builder r9 = r0.mBuilder
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setCustomBigContentView(r9, r6)
        L255:
            android.widget.RemoteViews r6 = r1.mHeadsUpContentView
            if (r6 == 0) goto L25e
            android.app.Notification$Builder r9 = r0.mBuilder
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setCustomHeadsUpContentView(r9, r6)
        L25e:
            if (r2 < r4) goto L2a7
            android.app.Notification$Builder r6 = r0.mBuilder
            int r9 = r1.mBadgeIcon
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setBadgeIconType(r6, r9)
            android.app.Notification$Builder r6 = r0.mBuilder
            java.lang.CharSequence r9 = r1.mSettingsText
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setSettingsText(r6, r9)
            android.app.Notification$Builder r6 = r0.mBuilder
            java.lang.String r9 = r1.mShortcutId
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setShortcutId(r6, r9)
            android.app.Notification$Builder r6 = r0.mBuilder
            long r11 = r1.mTimeout
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setTimeoutAfter(r6, r11)
            android.app.Notification$Builder r6 = r0.mBuilder
            int r9 = r1.mGroupAlertBehavior
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setGroupAlertBehavior(r6, r9)
            boolean r6 = r1.mColorizedSet
            if (r6 == 0) goto L28e
            android.app.Notification$Builder r6 = r0.mBuilder
            boolean r9 = r1.mColorized
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setColorized(r6, r9)
        L28e:
            java.lang.String r6 = r1.mChannelId
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L2a7
            android.app.Notification$Builder r6 = r0.mBuilder
            android.app.Notification$Builder r6 = r6.setSound(r7)
            android.app.Notification$Builder r6 = r6.setDefaults(r10)
            android.app.Notification$Builder r6 = r6.setLights(r10, r10, r10)
            r6.setVibrate(r7)
        L2a7:
            if (r2 < r3) goto L2c5
            java.util.ArrayList<androidx.core.app.Person> r2 = r1.mPersonList
            java.util.Iterator r2 = r2.iterator()
        L2af:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c5
            java.lang.Object r3 = r2.next()
            androidx.core.app.Person r3 = (androidx.core.app.Person) r3
            android.app.Notification$Builder r6 = r0.mBuilder
            android.app.Person r3 = r3.toAndroidPerson()
            androidx.core.app.NotificationCompatBuilder.Api28Impl.addPerson(r6, r3)
            goto L2af
        L2c5:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L2ea
            android.app.Notification$Builder r3 = r0.mBuilder
            boolean r6 = r1.mAllowSystemGeneratedContextualActions
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setAllowSystemGeneratedContextualActions(r3, r6)
            android.app.Notification$Builder r3 = r0.mBuilder
            androidx.core.app.NotificationCompat$BubbleMetadata r6 = r1.mBubbleMetadata
            android.app.Notification$BubbleMetadata r6 = androidx.core.app.NotificationCompat.BubbleMetadata.toPlatform(r6)
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setBubbleMetadata(r3, r6)
            androidx.core.content.LocusIdCompat r3 = r1.mLocusId
            if (r3 == 0) goto L2ea
            android.app.Notification$Builder r6 = r0.mBuilder
            android.content.LocusId r3 = r3.toLocusId()
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setLocusId(r6, r3)
        L2ea:
            r3 = 31
            if (r2 < r3) goto L2f7
            int r3 = r1.mFgsDeferBehavior
            if (r3 == 0) goto L2f7
            android.app.Notification$Builder r6 = r0.mBuilder
            androidx.core.app.NotificationCompatBuilder.Api31Impl.setForegroundServiceBehavior(r6, r3)
        L2f7:
            boolean r1 = r1.mSilent
            if (r1 == 0) goto L336
            androidx.core.app.NotificationCompat$Builder r1 = r0.mBuilderCompat
            boolean r1 = r1.mGroupSummary
            if (r1 == 0) goto L304
            r0.mGroupAlertBehavior = r8
            goto L307
        L304:
            r1 = 1
            r0.mGroupAlertBehavior = r1
        L307:
            android.app.Notification$Builder r1 = r0.mBuilder
            r1.setVibrate(r7)
            android.app.Notification$Builder r1 = r0.mBuilder
            r1.setSound(r7)
            int r1 = r5.defaults
            r1 = r1 & (-4)
            r5.defaults = r1
            android.app.Notification$Builder r3 = r0.mBuilder
            r3.setDefaults(r1)
            if (r2 < r4) goto L336
            androidx.core.app.NotificationCompat$Builder r1 = r0.mBuilderCompat
            java.lang.String r1 = r1.mGroupKey
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L32f
            android.app.Notification$Builder r1 = r0.mBuilder
            java.lang.String r2 = "silent"
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setGroup(r1, r2)
        L32f:
            android.app.Notification$Builder r1 = r0.mBuilder
            int r2 = r0.mGroupAlertBehavior
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setGroupAlertBehavior(r1, r2)
        L336:
            return
    }

    private void addAction(androidx.core.app.NotificationCompat.Action r6) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            androidx.core.graphics.drawable.IconCompat r1 = r6.getIconCompat()
            r2 = 23
            r3 = 0
            if (r0 < r2) goto L20
            if (r1 == 0) goto L12
            android.graphics.drawable.Icon r0 = r1.toIcon()
            goto L13
        L12:
            r0 = 0
        L13:
            java.lang.CharSequence r1 = r6.getTitle()
            android.app.PendingIntent r2 = r6.getActionIntent()
            android.app.Notification$Action$Builder r0 = androidx.core.app.NotificationCompatBuilder.Api23Impl.createBuilder(r0, r1, r2)
            goto L34
        L20:
            if (r1 == 0) goto L27
            int r0 = r1.getResId()
            goto L28
        L27:
            r0 = 0
        L28:
            java.lang.CharSequence r1 = r6.getTitle()
            android.app.PendingIntent r2 = r6.getActionIntent()
            android.app.Notification$Action$Builder r0 = androidx.core.app.NotificationCompatBuilder.Api20Impl.createBuilder(r0, r1, r2)
        L34:
            androidx.core.app.RemoteInput[] r1 = r6.getRemoteInputs()
            if (r1 == 0) goto L4d
            androidx.core.app.RemoteInput[] r1 = r6.getRemoteInputs()
            android.app.RemoteInput[] r1 = androidx.core.app.RemoteInput.fromCompat(r1)
            int r2 = r1.length
        L43:
            if (r3 >= r2) goto L4d
            r4 = r1[r3]
            androidx.core.app.NotificationCompatBuilder.Api20Impl.addRemoteInput(r0, r4)
            int r3 = r3 + 1
            goto L43
        L4d:
            android.os.Bundle r1 = r6.getExtras()
            if (r1 == 0) goto L5d
            android.os.Bundle r1 = new android.os.Bundle
            android.os.Bundle r2 = r6.getExtras()
            r1.<init>(r2)
            goto L62
        L5d:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L62:
            java.lang.String r2 = "android.support.allowGeneratedReplies"
            boolean r3 = r6.getAllowGeneratedReplies()
            r1.putBoolean(r2, r3)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L78
            boolean r3 = r6.getAllowGeneratedReplies()
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setAllowGeneratedReplies(r0, r3)
        L78:
            java.lang.String r3 = "android.support.action.semanticAction"
            int r4 = r6.getSemanticAction()
            r1.putInt(r3, r4)
            r3 = 28
            if (r2 < r3) goto L8c
            int r3 = r6.getSemanticAction()
            androidx.core.app.NotificationCompatBuilder.Api28Impl.setSemanticAction(r0, r3)
        L8c:
            r3 = 29
            if (r2 < r3) goto L97
            boolean r3 = r6.isContextual()
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setContextual(r0, r3)
        L97:
            r3 = 31
            if (r2 < r3) goto La2
            boolean r2 = r6.isAuthenticationRequired()
            androidx.core.app.NotificationCompatBuilder.Api31Impl.setAuthenticationRequired(r0, r2)
        La2:
            java.lang.String r2 = "android.support.action.showsUserInterface"
            boolean r6 = r6.getShowsUserInterface()
            r1.putBoolean(r2, r6)
            androidx.core.app.NotificationCompatBuilder.Api20Impl.addExtras(r0, r1)
            android.app.Notification$Builder r6 = r5.mBuilder
            android.app.Notification$Action r0 = androidx.core.app.NotificationCompatBuilder.Api20Impl.build(r0)
            androidx.core.app.NotificationCompatBuilder.Api20Impl.addAction(r6, r0)
            return
    }

    @androidx.annotation.Nullable
    private static java.util.List<java.lang.String> combineLists(@androidx.annotation.Nullable java.util.List<java.lang.String> r3, @androidx.annotation.Nullable java.util.List<java.lang.String> r4) {
            if (r3 != 0) goto L3
            return r4
        L3:
            if (r4 != 0) goto L6
            return r3
        L6:
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.addAll(r3)
            r0.addAll(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            return r3
    }

    @androidx.annotation.Nullable
    private static java.util.List<java.lang.String> getPeople(@androidx.annotation.Nullable java.util.List<androidx.core.app.Person> r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            androidx.core.app.Person r1 = (androidx.core.app.Person) r1
            java.lang.String r1 = r1.resolveToLegacyUri()
            r0.add(r1)
            goto L11
        L25:
            return r0
    }

    private void removeSoundAndVibration(android.app.Notification r2) {
            r1 = this;
            r0 = 0
            r2.sound = r0
            r2.vibrate = r0
            int r0 = r2.defaults
            r0 = r0 & (-4)
            r2.defaults = r0
            return
    }

    public android.app.Notification build() {
            r3 = this;
            androidx.core.app.NotificationCompat$Builder r0 = r3.mBuilderCompat
            androidx.core.app.NotificationCompat$Style r0 = r0.mStyle
            if (r0 == 0) goto L9
            r0.apply(r3)
        L9:
            if (r0 == 0) goto L10
            android.widget.RemoteViews r1 = r0.makeContentView(r3)
            goto L11
        L10:
            r1 = 0
        L11:
            android.app.Notification r2 = r3.buildInternal()
            if (r1 == 0) goto L1a
            r2.contentView = r1
            goto L22
        L1a:
            androidx.core.app.NotificationCompat$Builder r1 = r3.mBuilderCompat
            android.widget.RemoteViews r1 = r1.mContentView
            if (r1 == 0) goto L22
            r2.contentView = r1
        L22:
            if (r0 == 0) goto L2c
            android.widget.RemoteViews r1 = r0.makeBigContentView(r3)
            if (r1 == 0) goto L2c
            r2.bigContentView = r1
        L2c:
            if (r0 == 0) goto L3a
            androidx.core.app.NotificationCompat$Builder r1 = r3.mBuilderCompat
            androidx.core.app.NotificationCompat$Style r1 = r1.mStyle
            android.widget.RemoteViews r1 = r1.makeHeadsUpContentView(r3)
            if (r1 == 0) goto L3a
            r2.headsUpContentView = r1
        L3a:
            if (r0 == 0) goto L45
            android.os.Bundle r1 = androidx.core.app.NotificationCompat.getExtras(r2)
            if (r1 == 0) goto L45
            r0.addCompatExtras(r1)
        L45:
            return r2
    }

    protected android.app.Notification buildInternal() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.app.Notification$Builder r0 = r4.mBuilder
            android.app.Notification r0 = r0.build()
            return r0
        Ld:
            r1 = 24
            r2 = 1
            r3 = 2
            if (r0 < r1) goto L44
            android.app.Notification$Builder r0 = r4.mBuilder
            android.app.Notification r0 = r0.build()
            int r1 = r4.mGroupAlertBehavior
            if (r1 == 0) goto L43
            java.lang.String r1 = androidx.core.app.NotificationCompatBuilder.Api20Impl.getGroup(r0)
            if (r1 == 0) goto L30
            int r1 = r0.flags
            r1 = r1 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L30
            int r1 = r4.mGroupAlertBehavior
            if (r1 != r3) goto L30
            r4.removeSoundAndVibration(r0)
        L30:
            java.lang.String r1 = androidx.core.app.NotificationCompatBuilder.Api20Impl.getGroup(r0)
            if (r1 == 0) goto L43
            int r1 = r0.flags
            r1 = r1 & 512(0x200, float:7.17E-43)
            if (r1 != 0) goto L43
            int r1 = r4.mGroupAlertBehavior
            if (r1 != r2) goto L43
            r4.removeSoundAndVibration(r0)
        L43:
            return r0
        L44:
            android.app.Notification$Builder r0 = r4.mBuilder
            android.os.Bundle r1 = r4.mExtras
            r0.setExtras(r1)
            android.app.Notification$Builder r0 = r4.mBuilder
            android.app.Notification r0 = r0.build()
            android.widget.RemoteViews r1 = r4.mContentView
            if (r1 == 0) goto L57
            r0.contentView = r1
        L57:
            android.widget.RemoteViews r1 = r4.mBigContentView
            if (r1 == 0) goto L5d
            r0.bigContentView = r1
        L5d:
            android.widget.RemoteViews r1 = r4.mHeadsUpContentView
            if (r1 == 0) goto L63
            r0.headsUpContentView = r1
        L63:
            int r1 = r4.mGroupAlertBehavior
            if (r1 == 0) goto L8d
            java.lang.String r1 = androidx.core.app.NotificationCompatBuilder.Api20Impl.getGroup(r0)
            if (r1 == 0) goto L7a
            int r1 = r0.flags
            r1 = r1 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L7a
            int r1 = r4.mGroupAlertBehavior
            if (r1 != r3) goto L7a
            r4.removeSoundAndVibration(r0)
        L7a:
            java.lang.String r1 = androidx.core.app.NotificationCompatBuilder.Api20Impl.getGroup(r0)
            if (r1 == 0) goto L8d
            int r1 = r0.flags
            r1 = r1 & 512(0x200, float:7.17E-43)
            if (r1 != 0) goto L8d
            int r1 = r4.mGroupAlertBehavior
            if (r1 != r2) goto L8d
            r4.removeSoundAndVibration(r0)
        L8d:
            return r0
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public android.app.Notification.Builder getBuilder() {
            r1 = this;
            android.app.Notification$Builder r0 = r1.mBuilder
            return r0
    }

    android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }
}
