package com.example.nafasivibao.navigation

import android.media.tv.TvContract.Channels.Logo
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvm.ui.theme.screens.about.AboutScreen
import com.example.nafasivibao.BottomNavy
import com.example.nafasivibao.ui.theme.screens.contactcompany.ContactCompanyScreen
import com.example.nafasivibao.ui.theme.screens.home.Homescreen
import com.example.nafasivibao.ui.theme.screens.login.LoginScreen
import com.example.nafasivibao.ui.theme.screens.logout.LogoutScreen
import com.example.nafasivibao.ui.theme.screens.postedscreen.PostedScreen
import com.example.nafasivibao.ui.theme.screens.product.AddProductsScreen
import com.example.nafasivibao.ui.theme.screens.product.UpdateScreen
import com.example.nafasivibao.ui.theme.screens.product.ViewProductsScreen
import com.example.nafasivibao.ui.theme.screens.profile.ProfileScreen
import com.example.nafasivibao.ui.theme.screens.register.RegisterScreen
import com.example.nafasivibao.ui.theme.screens.splashscreen.SplashScreen
import com.example.nafasivibao.ui.theme.screens.viewadded.ViewAddedJobs


@Suppress("DEPRECATION")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavHost(modifier: Modifier= Modifier, navController:NavHostController= rememberNavController(), startDestination:String= ROUTE_LOGIN){
    NavHost(navController =navController,modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_HOME){
            Homescreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_PROFILE){
           ProfileScreen(navController)
        }
        composable(ROUTE_LOGOUT){
            LogoutScreen(navController)
        }
        composable(ROUTE_SPLASH){
            ViewProductsScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }
        composable(ROUTE_VIEWADDED) {
          AddProductsScreen(navController)
        }
        composable(ROUTE_VIEWCOMP) {
            ContactCompanyScreen(navController)
        }
        composable(ROUTE_VIEWPOSTED) {
            PostedScreen(navController)
        }
        composable(ROUTE_UPDATE+ "/{id}"){passedData->
            UpdateScreen(navController,passedData.arguments?.getString("id")!!)
        }
    }

}