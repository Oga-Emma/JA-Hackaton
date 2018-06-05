package org.ja_nigeria.janigeria

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.TabLayout.GRAVITY_FILL
import android.support.v4.view.GravityCompat
import android.support.v4.view.ViewPager
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.nav_header_main.*
import org.ja_nigeria.janigeria.features.chat_channels.ChatChannelFragment
import org.ja_nigeria.janigeria.features.dashboard.DashBoardFragment
import org.ja_nigeria.janigeria.features.download.DownloadFragment
import org.ja_nigeria.janigeria.features.events.EventFragment
import org.ja_nigeria.janigeria.features.messages.notification.NotificationFragment
import org.ja_nigeria.janigeria.features.profile.ProfileFragment

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener,
        DashBoardFragment.TabLayoutSetupCallback, NotificationFragment.TabLayoutSetupCallbackNotifications {


    override fun setupNotificationTabLayout(viewPager: ViewPager?) {
        var tabLayout = tab_layout

        tabLayout.tabGravity = GRAVITY_FILL

        tabLayout.setupWithViewPager(viewPager)
    }

    override fun setupTabLayout(viewPager: ViewPager?) {
        var tabLayout = tab_layout

        tabLayout.tabGravity = GRAVITY_FILL

        tabLayout.setupWithViewPager(viewPager)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.title = getString(R.string.dashboard)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        supportFragmentManager.beginTransaction()
                .replace(R.id.container, DashBoardFragment.newInstance())
                .commit()
        tab_layout.visibility = View.VISIBLE


        val header = nav_view.getHeaderView(0)

        header.findViewById<View>(R.id.app_bar_layout).setOnClickListener({
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, ProfileFragment())
                    .commit()
            tab_layout.visibility = View.GONE
            toolbar.title = "Profile"


            drawer_layout.closeDrawer(GravityCompat.START)
        })


    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {

            R.id.nav_dashboard -> {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.container, DashBoardFragment.newInstance())
                        .commit()
                toolbar.title = getString(R.string.dashboard)
                tab_layout.visibility = View.VISIBLE
            }

            R.id.nav_notifications -> {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.container, NotificationFragment.newInstance())
                        .commit()
                tab_layout.visibility = View.VISIBLE
                toolbar.title = getString(R.string.notifications)
            }

            R.id.nav_chat -> {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.container, ChatChannelFragment.newInstance())
                        .commit()
                tab_layout.visibility = View.GONE
                toolbar.title = getString(R.string.chant_channels)
            }

            R.id.nav_profile -> {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.container, ProfileFragment())
                        .commit()
                tab_layout.visibility = View.GONE
                toolbar.title = "Profile"
            }

            R.id.nav_download -> {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.container, DownloadFragment())
                .commit()
                tab_layout.visibility = View.GONE
                toolbar.title = "Downloads"
            }

        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

}
