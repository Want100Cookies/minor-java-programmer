<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class OrderController extends Controller
{
    public function makeOrder(Request $request)
    {
        // For some reason laravel-cors doesn't do it's job with post requests...
        header('Access-Control-Allow-Origin: *');

        $user = $request->input('user');
        $laptop = $request->input('laptop');

        // Save them to DB or something

        return [
            'status' => 'ok',
        ];
    }
}
