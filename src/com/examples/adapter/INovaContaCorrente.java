/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.adapter;

/**
 *
 * @author ricardo
 */
public interface INovaContaCorrente {
    public String ultimos12Lancamentos();
    public float[] historicoSaldo();
}