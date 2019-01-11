package com.github.springbootdemo.demo;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {

        BlockingQueue<String> blockingQueue = new BlockingQueue<String>() {
            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public void put(String s) throws InterruptedException {

            }

            @Override
            public boolean offer(String s, long timeout, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public String take() throws InterruptedException {
                return null;
            }

            @Override
            public String poll(long timeout, TimeUnit unit) throws InterruptedException {
                return null;
            }

            @Override
            public int remainingCapacity() {
                return 0;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public int drainTo(Collection<? super String> c) {
                return 0;
            }

            @Override
            public int drainTo(Collection<? super String> c, int maxElements) {
                return 0;
            }

            @Override
            public String remove() {
                return null;
            }

            @Override
            public String poll() {
                return null;
            }

            @Override
            public String element() {
                return null;
            }

            @Override
            public String peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        Selector selector = new Selector() {
            @Override
            public boolean isOpen() {
                return false;
            }

            @Override
            public SelectorProvider provider() {
                return null;
            }

            @Override
            public Set<SelectionKey> keys() {
                return null;
            }

            @Override
            public Set<SelectionKey> selectedKeys() {
                return null;
            }

            @Override
            public int selectNow() throws IOException {
                return 0;
            }

            @Override
            public int select(long timeout) throws IOException {
                return 0;
            }

            @Override
            public int select() throws IOException {
                return 0;
            }

            @Override
            public Selector wakeup() {
                return null;
            }

            @Override
            public void close() throws IOException {

            }
        };

    }

}
